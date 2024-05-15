package com.example.anagrama;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TelaAnagrama extends AppCompatActivity {


    private static final String dadosApp = "ArquivoDados";

    private String palavraEmbaralhada, letraDigitada, palavraSemEdicao, nomeSelecionado, palavra;
    private String clickBtn1, clickBtn2, clickBtn3, clickBtn4, clickBtn5, clickBtn6, clickBtn7, clickBtn8, clickBtn9, clickBtn10, clickBtn11, clickBtn12, clickBtn13;
    private String letra0, letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9, letra10, letra11, letra12;
    private String letra_1, letra_2, letra_3, letra_4, letra_5, letra_6, letra_7, letra_8, letra_9, letra_10, letra_11, letra_12, letra_13;

    private TextView txtTotalPontos, txtDica;
    private TextView txtLetraMontada1, txtLetraMontada2, txtLetraMontada3, txtLetraMontada4, txtLetraMontada5, txtLetraMontada6, txtLetraMontada7, txtLetraMontada8, txtLetraMontada9, txtLetraMontada10, txtLetraMontada11, txtLetraMontada12, txtLetraMontada13;

    private Button buttonLetra1, buttonLetra2, buttonLetra3, buttonLetra4, buttonLetra5, buttonLetra6, buttonLetra7, buttonLetra8, buttonLetra9, buttonLetra10, buttonLetra11, buttonLetra12, buttonLetra13;


    private Button btnEmbaralhar, btnSair;

    private int posicaoLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anagrama);

//        Intent  obterDados = getIntent();
//        Usuario user2 = (Usuario) obterDados.getSerializableExtra("obj");
//        TextView nome = findViewById(R.id.nomeUsuario);
//        nome.setText("nome:   "+user2.nome);


        novoJogo();



        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        btnEmbaralhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                novoJogo();

            }
        });

        buttonLetra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (clickBtn1.equals("nao")){

                    clickBtn1 = "sim";
                    letraDigitada = letra0;
                    digitaLetra();

                    buttonLetra1.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {



                }

            }
        });

        buttonLetra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (clickBtn2.equals("nao")){

                    clickBtn2 = "sim";
                    letraDigitada = letra1;
                    digitaLetra();

                    buttonLetra2.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn3.equals("nao")){

                    clickBtn3 = "sim";
                    letraDigitada = letra2;
                    digitaLetra();

                    buttonLetra3.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn4.equals("nao")){

                    clickBtn4 = "sim";
                    letraDigitada = letra3;
                    digitaLetra();

                    buttonLetra4.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn5.equals("nao")){

                    clickBtn5 = "sim";
                    letraDigitada = letra4;
                    digitaLetra();

                    buttonLetra5.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn6.equals("nao")){

                    clickBtn6 = "sim";
                    letraDigitada = letra5;
                    digitaLetra();

                    buttonLetra6.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn7.equals("nao")){

                    clickBtn7 = "sim";
                    letraDigitada = letra6;
                    digitaLetra();

                    buttonLetra7.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn8.equals("nao")){

                    clickBtn8 = "sim";
                    letraDigitada = letra7;
                    digitaLetra();

                    buttonLetra8.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn9.equals("nao")){

                    clickBtn9 = "sim";
                    letraDigitada = letra8;
                    digitaLetra();

                    buttonLetra9.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn10.equals("nao")){

                    clickBtn10 = "sim";
                    letraDigitada = letra9;
                    digitaLetra();

                    buttonLetra10.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn11.equals("nao")){

                    clickBtn11 = "sim";
                    letraDigitada = letra10;
                    digitaLetra();

                    buttonLetra11.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn12.equals("nao")){

                    clickBtn12 = "sim";
                    letraDigitada = letra11;
                    digitaLetra();

                    buttonLetra12.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        buttonLetra13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (clickBtn13.equals("nao")){

                    clickBtn13 = "sim";
                    letraDigitada = letra12;
                    digitaLetra();

                    buttonLetra13.setBackgroundColor(Color.parseColor("#6BA73E"));

                }else {

                    Toast.makeText(TelaAnagrama.this, "Você já usou essa letra!", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }

    public String listaNomes(){

        List<String> minhaLista = Arrays.asList("cachorro", "gato", "elefante", "girafa", "galo", "coelho", "leao", "cachorro", "gato", "elefante", "girafa", "galo", "coelho", "leao");

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if (arquivos.contains("pontos")){

            posicaoLista = arquivos.getInt("pontos", 0);

            nomeSelecionado = minhaLista.get(posicaoLista);

            listaDica();

        }else {

            posicaoLista = 0;
            nomeSelecionado = minhaLista.get(posicaoLista);


        }


        return nomeSelecionado;

    }

    public String listaDica(){

        List<String> minhaListaDicas = Arrays.asList("1", "2", "3", "4", "5", "6", "7","1", "2", "3", "4", "5", "6", "7");

        String dica = minhaListaDicas.get(posicaoLista);

        txtDica.setText("A dica é: " + dica);

        return nomeSelecionado;

    }

    private void digitaLetra(){

        letra_1 = txtLetraMontada1.getText().toString();
        letra_2 = txtLetraMontada2.getText().toString();
        letra_3 = txtLetraMontada3.getText().toString();
        letra_4 = txtLetraMontada4.getText().toString();
        letra_5 = txtLetraMontada5.getText().toString();
        letra_6 = txtLetraMontada6.getText().toString();
        letra_7 = txtLetraMontada7.getText().toString();
        letra_8 = txtLetraMontada8.getText().toString();
        letra_9 = txtLetraMontada9.getText().toString();
        letra_10 = txtLetraMontada10.getText().toString();
        letra_11 = txtLetraMontada11.getText().toString();
        letra_12 = txtLetraMontada12.getText().toString();
        letra_13 = txtLetraMontada13.getText().toString();

        if (letra_1.equals("_")){
            txtLetraMontada1.setText(letraDigitada);
            letra_1 = txtLetraMontada1.getText().toString();
        }else if (letra_2.equals("_")){
            txtLetraMontada2.setText(letraDigitada);
            letra_2 = txtLetraMontada2.getText().toString();
        }else if (letra_3.equals("_")){
            txtLetraMontada3.setText(letraDigitada);
            letra_3 = txtLetraMontada3.getText().toString();
        }else if (letra_4.equals("_")){
            txtLetraMontada4.setText(letraDigitada);
            letra_4 = txtLetraMontada4.getText().toString();
        }else if (letra_5.equals("_")){
            txtLetraMontada5.setText(letraDigitada);
            letra_5 = txtLetraMontada5.getText().toString();
        }else if (letra_6.equals("_")){
            txtLetraMontada6.setText(letraDigitada);
            letra_6 = txtLetraMontada6.getText().toString();
        }else if (letra_7.equals("_")){
            txtLetraMontada7.setText(letraDigitada);
            letra_7 = txtLetraMontada7.getText().toString();
        }else if (letra_8.equals("_")){
            txtLetraMontada8.setText(letraDigitada);
            letra_8 = txtLetraMontada8.getText().toString();
        }else if (letra_9.equals("_")){
            txtLetraMontada9.setText(letraDigitada);
            letra_9 = txtLetraMontada9.getText().toString();
        }else if (letra_10.equals("_")){
            txtLetraMontada10.setText(letraDigitada);
            letra_10 = txtLetraMontada10.getText().toString();
        }else if (letra_11.equals("_")){
            txtLetraMontada11.setText(letraDigitada);
            letra_11 = txtLetraMontada11.getText().toString();
        }else if (letra_12.equals("_")){
            txtLetraMontada12.setText(letraDigitada);
            letra_12 = txtLetraMontada12.getText().toString();
        }else if (letra_13.equals("_")){
            txtLetraMontada13.setText(letraDigitada);
            letra_13 = txtLetraMontada13.getText().toString();
        }

        verificaSeVenceu();

    }

    private void verificaSeVenceu(){

        String pDigitada = letra_1 + letra_2 + letra_3 +  letra_4 + letra_5 + letra_6 + letra_7 + letra_8 + letra_9 + letra_10 + letra_11 + letra_12 + letra_13;

        String substituiAnderline = pDigitada.replace("_", "");
        String substituiEspacoVazio = substituiAnderline.replace(" ", "");

        String tamanhoPalavraSemEdicao = String.valueOf(palavraSemEdicao.length());
        String tamanhoPalavraDigitada = String.valueOf(substituiEspacoVazio.length());

        if (tamanhoPalavraSemEdicao.equals(tamanhoPalavraDigitada)){

            if (substituiEspacoVazio.equals(palavraSemEdicao)){

                salvarPontos();

                Intent AbreTelaPonto = new Intent(getApplication(), TelaPontoActivity.class);
                AbreTelaPonto.putExtra("palavra", palavraSemEdicao);
                AbreTelaPonto.putExtra("status", "acertou");
                startActivity(AbreTelaPonto);

                SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);
                int qtdPontos = arquivos.getInt("pontos", 0);

                if(qtdPontos >= 3){
                    Intent ProximaFase = new Intent(getApplication(), testando.class);
                    startActivity(ProximaFase);
                }


            }else {

                Toast.makeText(this, "Você não Acertou!", Toast.LENGTH_LONG).show();
                Intent AbreTelaPonto = new Intent(getApplication(), TelaPontoActivity.class);
                AbreTelaPonto.putExtra("palavra", palavraSemEdicao);
                AbreTelaPonto.putExtra("status", "errou");
                startActivity(AbreTelaPonto);

            }

        }
    }

    private void salvarPontos(){

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if (arquivos.contains("pontos")){

            SharedPreferences.Editor editor = arquivos.edit();

            int qtdPontos = arquivos.getInt("pontos", 0);

            qtdPontos++;

            editor.putInt("pontos", qtdPontos);
            editor.commit();

            txtTotalPontos.setText("Pontos: " + qtdPontos );

        }else {

            SharedPreferences.Editor editor = arquivos.edit();


            editor.putInt("pontos", 0);
            editor.commit();

            txtTotalPontos.setText("Pontos: 0");

        }

    }

    private void novoJogo(){

        txtTotalPontos = findViewById(R.id.txtTotalPontos);

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if (arquivos.contains("pontos")){

            Integer resultado = arquivos.getInt("pontos", 0);
            txtTotalPontos.setText("Pontos: " + resultado );

        }else {

            SharedPreferences.Editor editor = arquivos.edit();
            editor.putInt("pontos", 0);
            editor.commit();

            txtTotalPontos.setText("Pontos: 0" );

        }

        txtDica = findViewById(R.id.txtDica);

        txtLetraMontada1 = findViewById(R.id.txtLetraMontada1);
        txtLetraMontada2 = findViewById(R.id.txtLetraMontada2);
        txtLetraMontada3 = findViewById(R.id.txtLetraMontada3);
        txtLetraMontada4 = findViewById(R.id.txtLetraMontada4);
        txtLetraMontada5 = findViewById(R.id.txtLetraMontada5);
        txtLetraMontada6 = findViewById(R.id.txtLetraMontada6);
        txtLetraMontada7 = findViewById(R.id.txtLetraMontada7);
        txtLetraMontada8 = findViewById(R.id.txtLetraMontada8);
        txtLetraMontada9 = findViewById(R.id.txtLetraMontada9);
        txtLetraMontada10 = findViewById(R.id.txtLetraMontada10);
        txtLetraMontada11 = findViewById(R.id.txtLetraMontada11);
        txtLetraMontada12 = findViewById(R.id.txtLetraMontada12);
        txtLetraMontada13 = findViewById(R.id.txtLetraMontada13);

        buttonLetra1 = findViewById(R.id.buttonLetra1);
        buttonLetra2 = findViewById(R.id.buttonLetra2);
        buttonLetra3 = findViewById(R.id.buttonLetra3);
        buttonLetra4 = findViewById(R.id.buttonLetra4);
        buttonLetra5 = findViewById(R.id.buttonLetra5);
        buttonLetra6 = findViewById(R.id.buttonLetra6);
        buttonLetra7 = findViewById(R.id.buttonLetra7);
        buttonLetra8 = findViewById(R.id.buttonLetra8);
        buttonLetra9 = findViewById(R.id.buttonLetra9);
        buttonLetra10 = findViewById(R.id.buttonLetra10);
        buttonLetra11 = findViewById(R.id.buttonLetra11);
        buttonLetra12 = findViewById(R.id.buttonLetra12);
        buttonLetra13 = findViewById(R.id.buttonLetra13);

        btnEmbaralhar = findViewById(R.id.btnEmbaralhar);
        btnSair = findViewById(R.id.btnSair);


        zeraLetras();

        palavra = listaNomes();
        palavraSemEdicao = palavra.toUpperCase();

        String texto = embaralharPalavra(palavra);
        palavraEmbaralhada = texto.toUpperCase();

        buttonLetra1.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra2.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra3.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra4.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra5.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra6.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra7.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra8.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra9.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra10.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra11.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra12.setBackgroundColor(Color.parseColor("#C9C9C9"));
        buttonLetra13.setBackgroundColor(Color.parseColor("#C9C9C9"));


        colocaLetrasNosBotoes();
        ocultarBotoes();

    }

    private void ocultarBotoes(){

        int totalLetras = palavraEmbaralhada.length();
        String quantidadeLetras = String.valueOf(totalLetras);

        if (quantidadeLetras.equals("1")){
            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.GONE);
            buttonLetra3.setVisibility(View.GONE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.GONE);
            txtLetraMontada3.setVisibility(View.GONE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);


        }else if (quantidadeLetras.equals("2")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.GONE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.GONE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("3")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.GONE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.GONE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("4")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.GONE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.GONE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("5")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.GONE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.GONE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("6")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.GONE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.GONE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("7")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.GONE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.GONE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("8")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.GONE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.GONE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("9")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.GONE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.GONE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("10")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.GONE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.GONE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("11")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.GONE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.GONE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("12")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.GONE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.GONE);

        }else if (quantidadeLetras.equals("13")){

            buttonLetra1.setVisibility(View.VISIBLE);
            buttonLetra2.setVisibility(View.VISIBLE);
            buttonLetra3.setVisibility(View.VISIBLE);
            buttonLetra4.setVisibility(View.VISIBLE);
            buttonLetra5.setVisibility(View.VISIBLE);
            buttonLetra6.setVisibility(View.VISIBLE);
            buttonLetra7.setVisibility(View.VISIBLE);
            buttonLetra8.setVisibility(View.VISIBLE);
            buttonLetra9.setVisibility(View.VISIBLE);
            buttonLetra10.setVisibility(View.VISIBLE);
            buttonLetra11.setVisibility(View.VISIBLE);
            buttonLetra12.setVisibility(View.VISIBLE);
            buttonLetra13.setVisibility(View.VISIBLE);

            txtLetraMontada1.setVisibility(View.VISIBLE);
            txtLetraMontada2.setVisibility(View.VISIBLE);
            txtLetraMontada3.setVisibility(View.VISIBLE);
            txtLetraMontada4.setVisibility(View.VISIBLE);
            txtLetraMontada5.setVisibility(View.VISIBLE);
            txtLetraMontada6.setVisibility(View.VISIBLE);
            txtLetraMontada7.setVisibility(View.VISIBLE);
            txtLetraMontada8.setVisibility(View.VISIBLE);
            txtLetraMontada9.setVisibility(View.VISIBLE);
            txtLetraMontada10.setVisibility(View.VISIBLE);
            txtLetraMontada11.setVisibility(View.VISIBLE);
            txtLetraMontada12.setVisibility(View.VISIBLE);
            txtLetraMontada13.setVisibility(View.VISIBLE);

        }
    }

    private void colocaLetrasNosBotoes(){

        String minhaPalavra = palavraEmbaralhada;

        try {

            letra0 = String.valueOf(minhaPalavra.charAt(0));
            letra1 = String.valueOf(minhaPalavra.charAt(1));
            letra2 = String.valueOf(minhaPalavra.charAt(2));
            letra3 = String.valueOf(minhaPalavra.charAt(3));
            letra4 = String.valueOf(minhaPalavra.charAt(4));
            letra5 = String.valueOf(minhaPalavra.charAt(5));
            letra6 = String.valueOf(minhaPalavra.charAt(6));
            letra7 = String.valueOf(minhaPalavra.charAt(7));
            letra8 = String.valueOf(minhaPalavra.charAt(8));
            letra9 = String.valueOf(minhaPalavra.charAt(9));
            letra10 = String.valueOf(minhaPalavra.charAt(10));
            letra11 = String.valueOf(minhaPalavra.charAt(11));
            letra12 = String.valueOf(minhaPalavra.charAt(12));



        }catch (Exception e){
            e.printStackTrace();
        }

        if(letra0 != null){
            buttonLetra1.setText(letra0);
        }

        if(letra1 != null){
            buttonLetra2.setText(letra1);
        }

        if(letra2 != null){
            buttonLetra3.setText(letra2);
        }

        if(letra3 != null){
            buttonLetra4.setText(letra3);
        }

        if(letra4 != null){
            buttonLetra5.setText(letra4);
        }

        if(letra5 != null){
            buttonLetra6.setText(letra5);
        }

        if(letra6 != null){
            buttonLetra7.setText(letra6);
        }

        if(letra7 != null){
            buttonLetra8.setText(letra7);
        }

        if(letra8 != null){
            buttonLetra9.setText(letra8);
        }

        if(letra9 != null){
            buttonLetra10.setText(letra9);
        }

        if(letra10 != null){
            buttonLetra11.setText(letra10);
        }

        if(letra11 != null){
            buttonLetra12.setText(letra11);
        }

        if(letra12 != null){
            buttonLetra13.setText(letra12);
        }



    }

    private void zeraLetras(){

        clickBtn1 = "nao";
        clickBtn2 = "nao";
        clickBtn3 = "nao";
        clickBtn4 = "nao";
        clickBtn5 = "nao";
        clickBtn6 = "nao";
        clickBtn7 = "nao";
        clickBtn8 = "nao";
        clickBtn9 = "nao";
        clickBtn10 = "nao";
        clickBtn11 = "nao";
        clickBtn12 = "nao";
        clickBtn13 = "nao";

        txtLetraMontada1.setText("_");
        txtLetraMontada2.setText("_");
        txtLetraMontada3.setText("_");
        txtLetraMontada4.setText("_");
        txtLetraMontada5.setText("_");
        txtLetraMontada6.setText("_");
        txtLetraMontada7.setText("_");
        txtLetraMontada8.setText("_");
        txtLetraMontada9.setText("_");
        txtLetraMontada10.setText("_");
        txtLetraMontada11.setText("_");
        txtLetraMontada12.setText("_");
        txtLetraMontada13.setText("_");


    }

    private String embaralharPalavra(String palavra){

        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);
        String palavraEmbaralhada = "";


        for (String letra : letras){

            palavraEmbaralhada += letra;

        }

        return palavraEmbaralhada;

    }

    @Override
    protected void onStart() {
        super.onStart();

        novoJogo();

    }


}