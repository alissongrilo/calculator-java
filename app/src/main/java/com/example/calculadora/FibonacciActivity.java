package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }

    public void Calcular(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView10);
        int x = Integer.parseInt(escrevendo.getText().toString());
        TextView texto = (TextView) findViewById(R.id.textView16);
        int n1 = 0, n2 = 1;
        for (int qtd = x + 1; qtd > 0; qtd--) {
            texto.setText(texto.getText() + Integer.toString(n1) + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}