package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimoActivity extends AppCompatActivity {

    Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primo);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }

    public void Calcular(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView2);
        int valor = Integer.parseInt(escrevendo.getText().toString());
        TextView texto = (TextView) findViewById(R.id.textView1);
        int contador=0,i;
        for(i=1;i<=valor;i++){
            if(valor%i==0){
                contador = 1+contador;
            }
        }
        if(contador==2){
            texto.setText("Primo!");
        }else{
            texto.setText("Não é primo!");
        }
    }
}