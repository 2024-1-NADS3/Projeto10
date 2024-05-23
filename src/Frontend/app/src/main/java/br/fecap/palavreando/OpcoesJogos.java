package br.fecap.palavreando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpcoesJogos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_jogos);
    }
    //funcoes para mudar para as proximas telas

    public void anagrama(View view){
        Intent mudarTela = new Intent(getApplicationContext(), TelaInstrucoes.class);
        startActivity(mudarTela);
    }

    public void jogoMemoria(View view){
        Intent mudarTela = new Intent(getApplicationContext(), TelaInstrucoes2.class);
        startActivity(mudarTela);
    }

    public void home(View view){
        Intent mudarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mudarTela);
    }
}