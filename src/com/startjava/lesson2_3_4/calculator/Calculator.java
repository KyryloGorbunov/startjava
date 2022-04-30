package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    //  +, -, *, /, ^, %
    public int calculate(String mathOperation) {
        String[] expression = mathOperation.split(" ");
        int a = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int b = Integer.parseInt(expression[2]);
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