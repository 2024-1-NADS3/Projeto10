package com.example.anagrama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelaNome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nome);


    }

    public void mudarTela(View view){
        TextView formNome = findViewById(R.id.formNomeUsuario);
        if(formNome.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "digite um nome valido", Toast.LENGTH_LONG).show();
        }else {

//        TextView formNome = findViewById(R.id.formNomeUsuario);
//        String nomeUser = formNome.getText().toString();
            Intent mudarTela = new Intent(getApplicationContext(), TelaIdade.class);
            startActivity(mudarTela);
        }
    }
}