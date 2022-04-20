package com.startjava.lesson2_3.calculator;

public class Calculator {

    private float a;
    private float b;
    private char sign;

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public float calculate() {
        float result = 0;
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
        }
        return result;
    }
}