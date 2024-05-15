package com.example.anagrama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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