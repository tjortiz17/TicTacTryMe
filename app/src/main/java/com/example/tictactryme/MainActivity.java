package com.example.tictactryme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[][] moves = new String[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                moves[i][j] = " ";
            }
        }
    }

    boolean isX = true;

    //button click method v2, shows an X or O depending on turn on click
    public void makeMove1(View view){
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button1);
        if(moves[0][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][0] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove2(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button2);
        if(moves[0][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][1] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove3(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button3);
        if(moves[0][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][2] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove4(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button4);
        if(moves[1][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][0] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove5(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button5);
        if(moves[1][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][1] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove6(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button6);
        if(moves[1][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][2] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove7(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button7);
        if(moves[2][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][0] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove8(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button8);
        if(moves[2][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][1] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    public void makeMove9(View view){
        TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        Button button = findViewById(R.id.button9);
        if(moves[2][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][2] = "X";
                } else {
                    button.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
        }
    }
    //returns true if board is full only
    public boolean isGameOver(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(moves[i][j].equals(" ")){
                    return false;
                }
            }
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText("Game Over. You Tied");
        return true;
    }

    //checks for win condition for either player
    public boolean isWin(){
        TextView textView = findViewById(R.id.textView);
        if(moves[0][0].equals("X") && moves[0][1].equals("X") && moves[0][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[1][0].equals("X") && moves[1][1].equals("X") && moves[1][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[2][0].equals("X") && moves[2][1].equals("X") && moves[2][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[0][0].equals("X") && moves[1][0].equals("X") && moves[2][0].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[0][1].equals("X") && moves[1][1].equals("X") && moves[2][1].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[0][2].equals("X") && moves[1][2].equals("X") && moves[2][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[0][0].equals("X") && moves[1][1].equals("X") && moves[2][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[2][0].equals("X") && moves[1][1].equals("X") && moves[0][2].equals("X")){
            textView.setText("Player X Wins!");
            return true;
        }
        else if(moves[0][0].equals("O") && moves[0][1].equals("O") && moves[0][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[1][0].equals("O") && moves[1][1].equals("O") && moves[1][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[2][0].equals("O") && moves[2][1].equals("O") && moves[2][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[0][0].equals("0") && moves[1][0].equals("O") && moves[2][0].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[0][1].equals("O") && moves[1][1].equals("O") && moves[2][1].equals("O")){
            textView.setText("Player 0 Wins!");
            return true;
        }
        else if(moves[0][2].equals("O") && moves[1][2].equals("O") && moves[2][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[0][0].equals("O") && moves[1][1].equals("O") && moves[2][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        else if(moves[2][0].equals("O") && moves[1][1].equals("O") && moves[0][2].equals("O")){
            textView.setText("Player O Wins!");
            return true;
        }
        return false;
    }
}
