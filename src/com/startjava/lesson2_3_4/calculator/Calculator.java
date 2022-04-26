package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

//  +, -, *, /, ^, %
    public int calculate() {
        int result = 0;
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '%':
                return a % b;
            case '^':
                return (int) Math.pow(a, b);
        }
        return result;
    }
}