package com.cursos.allydn.anagrama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaIdade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_idade);
    }

    public void mudarTela(View view){

        Intent mudarTela = new Intent(getApplicationContext(), TelaAnagrama.class);
        startActivity(mudarTela);
    }
}