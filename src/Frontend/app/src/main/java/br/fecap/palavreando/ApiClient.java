package br.fecap.palavreando;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ApiClient {

    private static final String TAG = "ApiClient";
    private static final String URL = "https://fwjc62-3000.csb.app/palavras";
    private RequestQueue requestQueue;

    // Chave e IV fixos (os mesmos usados para criptografar os dados no servidor)
    private static final String ENCRYPTION_KEY = "12345678901234567890123456789012";
    private static final String INIT_VECTOR = "1234567890123456";

    public ApiClient(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public void fetchWords(final WordsCallback callback) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        List<String> wordsList = new ArrayList<>();
                        List<String> hintsList = new ArrayList<>(); // Nova lista para armazenar as dicas

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject wordObject = response.getJSONObject(i);
                                String encryptedWord = wordObject.getString("palavra");
                                String decryptedWord = decrypt(encryptedWord);

                                String encrypthint = wordObject.getString("dica"); // Obtenha a dica do objeto JSON
                                String decryptedhint = decrypt(encrypthint);

                                wordsList.add(decryptedWord);
                                hintsList.add(decryptedhint); // Adicione a dica à nova lista

                            } catch (JSONException e) {
                                Log.e(TAG, "JSON parsing error: " + e.getMessage());
                            }
                        }
                        Log.d(TAG, "Words List: " + wordsList.toString());
                        Log.d(TAG, "Hints List: " + hintsList.toString()); // Log da nova lista de dicas
                        callback.onSuccess(wordsList, hintsList); // Chame o callback com ambas as listas
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e(TAG, "Error: " + error.toString());
                        callback.onError(error); // Chame o callback em caso de erro
                    }
                }
        );

        requestQueue.add(jsonArrayRequest);
    }

    private String decrypt(String encrypted) {
        try {
            String[] parts = encrypted.split(":");
            IvParameterSpec iv = new IvParameterSpec(hexStringToByteArray(parts[0]));
            SecretKeySpec skeySpec = new SecretKeySpec(ENCRYPTION_KEY.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(hexStringToByteArray(parts[1]));

            return new String(original, "UTF-8");
        } catch (Exception ex) {
            ex.printStackTrace();
            Log.e(TAG, "Decryption error: " + ex.getMessage());
        }

        return null;
    }

    private static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
