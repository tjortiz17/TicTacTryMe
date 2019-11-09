package com.example.tictactryme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean isX = true;

    //button click method v2, shows an X or O depending on turn on click
    public void makeMove1(View view){
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button1);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove2(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button2);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove3(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button3);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove4(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button4);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove5(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button5);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove6(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button6);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove7(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button7);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove8(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button8);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
    public void makeMove9(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button9);

        if(isX){
            button.setText("X");
            textView.setText("Player O's turn");
        }
        else{
            button.setText("0");
            textView.setText("Player X's turn");
        }
        isX = !isX;
    }
}
