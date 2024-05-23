package br.fecap.palavreando;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class TelaParabens extends AppCompatActivity {

    private static final String dadosApp = "ArquivoDados";

    TextView nomeUser3;
    RequestQueue filaRequest;
    String url="https://fwjc62-3000.csb.app/usersearch";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_parabens);
        filaRequest = Volley.newRequestQueue(this);
        GetData();
    }
    public void GetData() {
        nomeUser3 = findViewById(R.id.nomeUser3);


        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String nomeJ = response.getString("nome");
                            nomeUser3.setText(nomeJ+"!");
                        } catch (JSONException e) {
                            Log.e("Volley", "Erro no JSON", e);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", error.toString());
                    }
                });

        filaRequest.add(req);
    }

    // funcao para zerar os pontos e definir que o jogo ja foi zerado e voltar para tela inicial
    public void zerarJogo(View view){

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);
        SharedPreferences.Editor editor = arquivos.edit();
        editor.putInt("pontos", 0);
        editor.putString("jaZerou", "sim");
        editor.commit();

        Intent mudarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mudarTela);
    }

    public boolean verificarSebotaoVoltarEstaHabilitado() {
        TextView botaoVoltar = findViewById(R.id.buttonVoltar);
        return botaoVoltar.isEnabled();
    }

}