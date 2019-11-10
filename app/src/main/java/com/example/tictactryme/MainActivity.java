package com.example.tictactryme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MainActivity extends AppCompatActivity {

    String[][] moves = new String[3][3];
    boolean isX = true;
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                moves[i][j] = " ";
            }
        }
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
    }

    //button click method v2, shows an X or O depending on turn on click
    public void makeMove1(View view){
       // TextView textView = findViewById(R.id.textView);
       // Button button = findViewById(R.id.button1);
        if(moves[0][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button1.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][0] = "X";
                } else {
                    button1.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove2(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
       // Button button = findViewById(R.id.button2);
        if(moves[0][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button2.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][1] = "X";
                } else {
                    button2.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove3(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button3);
        if(moves[0][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button3.setText("X");
                    textView.setText("Player O's turn");
                    moves[0][2] = "X";
                } else {
                    button3.setText("O");
                    textView.setText("Player X's turn");
                    moves[0][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove4(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button4);
        if(moves[1][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button4.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][0] = "X";
                } else {
                    button4.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove5(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button5);
        if(moves[1][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button5.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][1] = "X";
                } else {
                    button5.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove6(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button6);
        if(moves[1][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button6.setText("X");
                    textView.setText("Player O's turn");
                    moves[1][2] = "X";
                } else {
                    button6.setText("O");
                    textView.setText("Player X's turn");
                    moves[1][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove7(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button7);
        if(moves[2][0].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button7.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][0] = "X";
                } else {
                    button7.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][0] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove8(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button8);
        if(moves[2][1].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button8.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][1] = "X";
                } else {
                    button8.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][1] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }
    public void makeMove9(View view){
        //TextView textView = findViewById(R.id.textView);
        //textView.setText("Player O's turn");
        //Button button = findViewById(R.id.button9);
        if(moves[2][2].equals(" ")) {
            if (!isGameOver() && !isWin()) {
                if (isX) {
                    button9.setText("X");
                    textView.setText("Player O's turn");
                    moves[2][2] = "X";
                } else {
                    button9.setText("O");
                    textView.setText("Player X's turn");
                    moves[2][2] = "O";
                }
            }
            isX = !isX;
            isGameOver();
            isWin();
            computerMove();
        }
    }

    //v1 of computer player move
    public void computerMove(){
        int highVal = -1000;
        int row = -1;
        int col = -1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(moves[i][j].equals(" ")){
                    moves[i][j] = "O";
                    int moveVal = findBestMove(isX);
                    moves[i][j] = " ";
                    if(moveVal > highVal){
                        row = i;
                        col = j;
                        highVal = moveVal;
                    }
                }
            }
        }
        //square 1
        if(row == 0 && col == 0){
            if(moves[0][0].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button1.setText("X");
                        textView.setText("Player O's turn");
                        moves[0][0] = "X";
                    } else {
                        button1.setText("O");
                        textView.setText("Player X's turn");
                        moves[0][0] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square two
        else if(row == 0 && col == 1){
            if(moves[0][1].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button2.setText("X");
                        textView.setText("Player O's turn");
                        moves[0][1] = "X";
                    } else {
                        button2.setText("O");
                        textView.setText("Player X's turn");
                        moves[0][1] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square three
        else if(row == 0 && col == 2){
            if(moves[0][2].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button3.setText("X");
                        textView.setText("Player O's turn");
                        moves[0][2] = "X";
                    } else {
                        button3.setText("O");
                        textView.setText("Player X's turn");
                        moves[0][2] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square four
        else if(row == 1 && col ==0){
            if(moves[1][0].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button4.setText("X");
                        textView.setText("Player O's turn");
                        moves[1][0] = "X";
                    } else {
                        button4.setText("O");
                        textView.setText("Player X's turn");
                        moves[1][0] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square five
        else if(row == 1 && col == 1){
            if(moves[1][1].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button5.setText("X");
                        textView.setText("Player O's turn");
                        moves[1][1] = "X";
                    } else {
                        button5.setText("O");
                        textView.setText("Player X's turn");
                        moves[1][1] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square six
        else if(row == 1 && col == 2){
            if(moves[1][2].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button6.setText("X");
                        textView.setText("Player O's turn");
                        moves[1][2] = "X";
                    } else {
                        button6.setText("O");
                        textView.setText("Player X's turn");
                        moves[1][2] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square seven
        else if(row == 2 && col == 0){
            if(moves[2][0].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button7.setText("X");
                        textView.setText("Player O's turn");
                        moves[2][0] = "X";
                    } else {
                        button7.setText("O");
                        textView.setText("Player X's turn");
                        moves[2][0] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square eight
        else if(row == 2 && col == 1){
            if(moves[2][1].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button8.setText("X");
                        textView.setText("Player O's turn");
                        moves[2][1] = "X";
                    } else {
                        button8.setText("O");
                        textView.setText("Player X's turn");
                        moves[2][1] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
        //square 9
        else if(row == 2 && col == 2){
            if(moves[2][2].equals(" ")) {
                if (!isGameOver() && !isWin()) {
                    if (isX) {
                        button9.setText("X");
                        textView.setText("Player O's turn");
                        moves[2][2] = "X";
                    } else {
                        button9.setText("O");
                        textView.setText("Player X's turn");
                        moves[2][2] = "O";
                    }
                }
                isX = !isX;
                isGameOver();
                isWin();
            }
        }
    }
    //algorithm to find best move
    int findBestMove(boolean isUser){
        int score = evaluate();
        //if computer has won return evaluated score
        if(score == 10){
            return score;
        }
        //if player has won return their score
        if(score == -10){
            return score;
        }
        //no more moves and no winner
        if(isGameOver()){
            return 0;
        }
        //if computers move
        if(isUser){
            int best = -1000;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(moves[i][j].equals(" ")){
                        moves[i][j] = "O";
                        best = max(best, findBestMove(!isUser));
                        moves[i][j] = " ";
                    }
                }
            }
            return best;
        }
        //simulate player move
        else{
            int best = 1000;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(moves[i][j].equals(" ")){
                        moves[i][j] = "X";
                        best = min(best, findBestMove(!isUser));
                        moves[i][j] = " ";
                    }
                }
            }
            return best;
        }
    }
    //evaluates certain moves for computer
    int evaluate(){
        //checking rows for victory
        for(int row = 0; row < 3; row++){
            if(moves[row][0].equals(moves[row][1]) && moves[row][1].equals(moves[row][2])){
                if(moves[row][0].equals("O")){
                    return 10; //winning move is computers
                }
                else if(moves[row][0].equals("X")){
                    return -10;
                }
            }
        }
        //checking columns for victory
        for(int col = 0; col < 3; col++){
            if(moves[0][col].equals(moves[1][col]) && moves[1][col].equals(moves[2][col])){
                if(moves[0][col].equals("O")){
                    return 10; //winning move is computers
                }
                else if(moves[0][col].equals("X")){
                    return -10;
                }
            }
        }
        //checking diagonals
        if(moves[0][0].equals(moves[1][1]) && moves[1][1].equals(moves[2][2])){
            if(moves[0][0].equals("O")){
                return 10;
            }
            else if(moves[0][0].equals("X")){
                return -10;
            }
        }
        if(moves[0][2].equals(moves[1][1]) && moves[1][1].equals(moves[2][0])){
            if(moves[0][2].equals("O")){
                return 10;
            }
            else if(moves[0][2].equals("X")){
                return -10;
            }
        }
        //return zero if no win
        return 0;
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

    //checks if computer player has a
}
