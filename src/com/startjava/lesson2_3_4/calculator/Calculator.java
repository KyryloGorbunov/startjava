package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    //  +, -, *, /, ^, %
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String[] expression = scanner.nextLine().split(" ");

        int a = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int b = Integer.parseInt(expression[2]);

        switch (sign) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(Math.subtractExact(a, b));
                break;
            case '*':
                System.out.println(Math.multiplyExact(a, b));
                break;
            case '/':
                System.out.println(Math.floorDiv(a, b));
                break;
            case '%':
                System.out.println(a % b);
                break;
            case '^':
                System.out.println(Math.pow(a, b));
                break;
        }
    }
}