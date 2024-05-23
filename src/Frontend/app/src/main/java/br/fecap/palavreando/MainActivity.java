package br.fecap.palavreando;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import java.util.List;

//tela inicial
public class MainActivity extends AppCompatActivity {

    private static final String dadosApp = "ArquivoDados";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiClient apiClient = new ApiClient(this);
        apiClient.fetchWords(new WordsCallback() {
            @Override
            public void onSuccess(List<String> words, List<String> hints) {
                Log.d(TAG, "Words List: " + words.toString());
                Log.d(TAG, "Hints List: " + hints.toString()); // Log da lista de dicas
            }

            @Override
            public void onError(Exception e) {
                Log.e(TAG, "Error: " + e.getMessage());
            }
        });

//        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);
//        SharedPreferences.Editor editor = arquivos.edit();
//        editor.remove("jaZerou");
//        editor.putInt("pontos", 0);
//        editor.commit();
    }

    //validar a quantidades de pontos para ver para qual pagina o usuário será redirecionado
    public void mudarTela(View view){

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if(arquivos.contains("jaZerou")){
            Intent mudarTela = new Intent(getApplicationContext(), OpcoesJogos.class);
            startActivity(mudarTela);
        }else{

            if (arquivos.contains("pontos")){
                Integer resultado = arquivos.getInt("pontos", 0);

                if(resultado <= 3 && resultado > 0) {
                    Intent voltarFase = new Intent(getApplicationContext(), TelaAnagrama.class);
                    startActivity(voltarFase);
                }else if(resultado > 3){
                    Intent mudarTela = new Intent(getApplicationContext(), TelaInstrucoes2.class);
                    startActivity(mudarTela);
                }else{
                    Intent mudarTela = new Intent(getApplicationContext(), TelaNome.class);
                    startActivity(mudarTela);
                }

            }else {
                SharedPreferences.Editor editor = arquivos.edit();
                editor.putInt("pontos", 0);
                editor.commit();

                Intent mudarTela = new Intent(getApplicationContext(), TelaNome.class);
                startActivity(mudarTela);
            }

        }

    }
}