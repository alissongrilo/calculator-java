package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonFibonacci, buttonPrimo, buttonFatorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFibonacci=findViewById(R.id.buttonFibonacci);
        buttonFatorial=findViewById(R.id.buttonFatorial);
        buttonPrimo=findViewById(R.id.buttonPrimo);

        buttonFibonacci.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fibonacciTela = new Intent(getApplicationContext(), FibonacciActivity.class);
                startActivity(fibonacciTela);
            }
        });

        buttonPrimo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent primoTela = new Intent(getApplicationContext(), PrimoActivity.class);
                startActivity(primoTela);
            }
        });

        buttonFatorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent fatorialTela = new Intent(getApplicationContext(), FatorialActivity.class);
                startActivity(fatorialTela);
            }
        });
    }
}