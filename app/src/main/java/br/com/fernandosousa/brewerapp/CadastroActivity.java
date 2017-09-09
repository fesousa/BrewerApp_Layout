package br.com.fernandosousa.brewerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button botao  = (Button)findViewById(R.id.botaoCadastro);
        botao.setOnClickListener(clickCadastro());
    }

    public View.OnClickListener clickCadastro(){
        return new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText nomeCerveja = (EditText)findViewById(R.id.nomeCerveja);
                EditText tipoCerveja = (EditText)findViewById(R.id.tipoCerveja);
                EditText paisCerveja = (EditText)findViewById(R.id.paisCerveja);
                EditText enderecoCerveja = (EditText)findViewById(R.id.enderecoCerveja);
                EditText precoCerveja = (EditText)findViewById(R.id.precoCerveja);

                String textoNomeCerveja = nomeCerveja.getText().toString();
                String textoTipoCerveja = tipoCerveja.getText().toString();
                String textoPaisCerveja = paisCerveja.getText().toString();
                String textoEnderecoCerveja = enderecoCerveja.getText().toString();
                String textoPrecoCerveja = precoCerveja.getText().toString();

                Intent returnIntent = new Intent();
                returnIntent.putExtra("nomeCerveja",textoNomeCerveja);
                returnIntent.putExtra("tipoCerveja",textoTipoCerveja);
                returnIntent.putExtra("paisCerveja",textoPaisCerveja);
                returnIntent.putExtra("enderecoCerveja",textoEnderecoCerveja);
                returnIntent.putExtra("precoCerveja",textoPrecoCerveja);

                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        };
    }
}
