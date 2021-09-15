package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class BigintActivity extends AppCompatActivity {

    private Stack<String> stack1 = new Stack<String>();
    Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigint);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void Empilha(View view) {
        EditText escrevendo = (EditText) findViewById(R.id.textView18);
        stack1.push(escrevendo.getText().toString());
        Atualiza();
    }

    public void Desempilha(View view) {
        stack1.pop();
        Atualiza();
    }

    public void Mais(View view) {
        char[] a,b;
        int c[] = new int[30];
        String passando = "";
        String temp2 = "",temp1 = "";
        String pop2 = stack1.pop();
        String pop1 = stack1.pop();
        a = pop1.toCharArray();
        b = pop2.toCharArray();
        for(int i = pop1.length()-1; i >= 0; i--){
            temp1 += a[i];
        }
        for(int i = pop2.length()-1; i >= 0; i--){
            temp2 += b[i];
        }
        a = temp1.toCharArray();
        b = temp2.toCharArray();
        for(int i = 0; i < pop1.length(); i++){
            c[i] = c[i] + Character.getNumericValue(a[i]);
        }
        for(int i = 0; i < pop2.length(); i++){
            c[i] = c[i] + Character.getNumericValue(b[i]);
            c[i + 1] = c[i + 1] + (c[i] / 10);
            c[i] = c[i] - (10 * (c[i] / 10));
        }
        if(pop1.length() > pop2.length()){
            if(c[pop1.length()] != 0){
                passando += Integer.toString(c[pop1.length()]);
            }
            for(int i = pop1.length()-1; i >= 0; i--){
                passando += Integer.toString(c[i]);
            }
        } else {
            if(c[pop2.length()] != 0){
                passando += Integer.toString(c[pop2.length()]);
            }
            for(int i = pop2.length()-1; i >= 0; i--){
                passando += Integer.toString(c[i]);
            }
        }
        stack1.push(passando);
        Atualiza();
    }

    public void Multiplica(View view) {
        char[] a,b;
        int c[] = new int[30];
        String passando = "";
        String pop2 = stack1.pop();
        String pop1 = stack1.pop();
        b = pop2.toCharArray();
        a = pop1.toCharArray();
        for(int i = pop1.length()-1; i >= 0; i--){
            for(int j = pop2.length()-1; j >= 0; j--){
                c[j+i] = c[j+i] + Character.getNumericValue(a[i]) * Character.getNumericValue(b[j]);
                if(j+i-1 >= 0) {
                    c[j + i - 1] = c[j + i - 1] + (c[j + i] / 10);
                    c[j + i] = c[j + i] - (10 * (c[j + i] / 10));
                }
            }
        }
        for (int i = 0; i <= pop2.length() + pop1.length() - 2; i++){
            passando += Integer.toString(c[i]);
        }
        stack1.push(passando);
        Atualiza();
    }

    public void Atualiza(){
        TextView texto = (TextView) findViewById(R.id.textView19);
        texto.setText(stack1.toString());
    }
}