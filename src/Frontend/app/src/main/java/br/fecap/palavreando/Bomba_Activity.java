package br.fecap.palavreando;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Bomba_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomba2);

    }

    //funcao para próxima tela
    public void voltarTela(View view){
        Intent mudarTela = new Intent(getApplicationContext(), TelaInstrucoes2.class);
        startActivity(mudarTela);
    }
}