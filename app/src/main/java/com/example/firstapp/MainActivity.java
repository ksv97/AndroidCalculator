package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private EditText inputView;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        inputView = findViewById(R.id.input);
        resultView = findViewById(R.id.result);
    }

    public void onClickPlusButton(View view) {
        calculate(Operations.PLUS);
    }

    public void onClickMinusButton(View view) {
        calculate(Operations.MINUS);
    }

    public void onClickDivideButton(View view) {
        calculate(Operations.DIVIDE);
    }

    public void onClickMultiplyButton(View view) {
        calculate(Operations.MULTIPLY);
    }

    public int getOperandValue() {
        return Integer.parseInt(inputView.getText().toString());
    }

    public void calculate(Operations operation) {
        calculator.calculate(getOperandValue(),operation);
        String result = Integer.toString(calculator.getResult());
        resultView.setText(result);
        inputView.getText().clear();
    }

}