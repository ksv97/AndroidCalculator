package com.example.firstapp;

enum Operations{
    PLUS, MINUS, DIVIDE, MULTIPLY
}

public class Calculator {

    private int result;

    public Calculator() {
        result = 0;
    }

    public void calculate(int operand, Operations currentOperation) {
        switch (currentOperation) {
            case PLUS: result += operand; break;
            case DIVIDE: result /= operand; break;
            case MINUS: result -= operand; break;
            case MULTIPLY: result *= operand; break;
        }
    }

    public int getResult() {
        return result;
    }

}
