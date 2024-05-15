package com.cursos.allydn.anagrama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarTela(View view){
        Intent mudarTela = new Intent(getApplicationContext(), TelaNome.class);
        startActivity(mudarTela);
    }
}