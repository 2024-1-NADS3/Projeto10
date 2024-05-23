package br.fecap.palavreando;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class TelaNome extends AppCompatActivity {

    private RequestQueue filaRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nome);

        filaRequest = Volley.newRequestQueue(this);
        //bHelper = new DBHelper(this);

    }


    public void botaoCadastro(View view) { // Método chamado quando o botão de cadastro é clicado
        EditText formNome = findViewById(R.id.formNomeUsuario); // Obtém o EditText onde o usuário digita o nome
        String nome; // Declaração da variável para armazenar o nome

        nome = formNome.getText().toString(); // Obtém o texto digitado e o converte para uma string

        if (nome.equals("")) { // Verifica se o campo do nome está vazio
            Toast.makeText(getApplicationContext(), "digite um nome válido", Toast.LENGTH_LONG).show(); // Mostra uma mensagem para o usuário informando que o nome é inválido
        } else {
            try {
                // Configura a fila de requisições Volley
                RequestQueue requestQueue = Volley.newRequestQueue(this);
                // URL para a qual a requisição POST será enviada
                String URL = "https://fwjc62-3000.csb.app/user";
                JSONObject jsonBody = new JSONObject();
                jsonBody.put("nome", nome);
                final String requestBody = jsonBody.toString(); // Converte o objeto JSON em uma string

                // Cria uma requisição POST utilizando Volley
                StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("VOLLEY", response); // Se a requisição for bem-sucedida, registra a resposta no log
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("VOLLEY", error.toString()); // Se ocorrer um erro na requisição, registra o erro no log
                    }
                }) {
                    @Override
                    public String getBodyContentType() {
                        return "application/json; charset=utf-8"; // Define o tipo de conteúdo do corpo da requisição como JSON
                    }

                    @Override
                    public byte[] getBody() throws AuthFailureError {
                        try {
                            return requestBody == null ? null : requestBody.getBytes("utf-8"); // Obtém o corpo da requisição como bytes
                        } catch (UnsupportedEncodingException uee) {
                            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", requestBody, "utf-8");
                            return null;
                        }
                    }

                    @Override
                    protected Response<String> parseNetworkResponse(NetworkResponse response) {
                        String responseString = "";
                        if (response != null) {
                            responseString = String.valueOf(response.statusCode); // Obtém o código de status da resposta
                        }
                        return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
                    }
                };

                // Inicia uma nova atividade após a conclusão do cadastro
                Intent mudarTela = new Intent(getApplicationContext(), TelaIdade.class);
                startActivity(mudarTela);
                requestQueue.add(stringRequest);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void home(View view){
        Intent mudarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mudarTela);
    }

    public boolean verificarSebotaoConfirmarEstaHabilitado() {
        TextView botaoConfirmar = findViewById(R.id.botaoConfirmar);
        return botaoConfirmar.isEnabled();
    }
}