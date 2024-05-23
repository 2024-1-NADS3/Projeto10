package br.fecap.palavreando;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelaIdade extends AppCompatActivity {

    TextView formDia;
    TextView formMes;
    TextView formAno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_idade);

        formDia = findViewById(R.id.formDia);
        formMes = findViewById(R.id.formMes);
        formAno = findViewById(R.id.formAno);

        //função para passar automaticamente para o proximo campo quando atingir o maximo de caracteres
        formDia.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Quando o texto no editTextDay tem 2 caracteres, move o foco para o editTextMonth
                if (s.length() == 2) {
                   formMes.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        // Adiciona o TextWatcher ao editTextMonth
        formMes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Quando o texto no editTextMonth tem 2 caracteres, move o foco para o editTextYear
                if (s.length() == 2) {
                    formAno.requestFocus();
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    public void mudarTela(View view) {

        formDia = findViewById(R.id.formDia);
        formMes = findViewById(R.id.formMes);
        formAno = findViewById(R.id.formAno);

        // validacao para verificar se a data de nascimento é valida
        if (TextUtils.isEmpty(formDia.getText()) || TextUtils.isEmpty(formMes.getText()) || TextUtils.isEmpty(formAno.getText())) {
            Toast.makeText(getApplicationContext(), "Por favor, preencha todos os campos", Toast.LENGTH_LONG).show();
        } else {
            int dia = Integer.parseInt(formDia.getText().toString());
            int mes = Integer.parseInt(formMes.getText().toString());
            int ano = Integer.parseInt(formAno.getText().toString());

            if (dia > 31 || mes > 12 || ano > 2020 || ano < 1900) {
                Toast.makeText(getApplicationContext(), "Digite uma data válida", Toast.LENGTH_LONG).show();
            } else {
                Intent mudarTela = new Intent(getApplicationContext(), TelaInstrucoes.class);
                startActivity(mudarTela);
            }
        }
    }

    public void home(View view){
        Intent mudarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(mudarTela);
    }
}