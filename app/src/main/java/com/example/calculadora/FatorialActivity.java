package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FatorialActivity extends AppCompatActivity {

    Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }

    public void Calcular(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView7);
        int valor = Integer.parseInt(escrevendo.getText().toString());
        int i,fat=1;
        for( i = 2; i <= valor; i++ ){
            fat*=i;
        }
        Atualiza(fat);
    }

    public void Atualiza(int fat){
        TextView texto = (TextView) findViewById(R.id.textView12);
        texto.setText(Integer.toString(fat));
    }
}