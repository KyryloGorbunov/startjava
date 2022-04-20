package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = 2;
        char sign = '^';
        float result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = (a * b);
        } else if (sign == '/') {
            result = (float) a / (float) b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}