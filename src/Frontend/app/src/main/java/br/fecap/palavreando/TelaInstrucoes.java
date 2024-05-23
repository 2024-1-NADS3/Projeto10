package br.fecap.palavreando;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaInstrucoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_instrucoes);
    }

    //funcoes para mudar tela

    public void mudarTela(View view){
        Intent mudarTela = new Intent(getApplicationContext(), TelaAnagrama.class);
        startActivity(mudarTela);
    }

    public void home(View view){
        Intent mudarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mudarTela);
    }
}