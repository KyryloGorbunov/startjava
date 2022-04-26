package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter a mathematical expression: ");
            answer = scanner.nextLine();
            String[] expression = answer.split(" ");

            calculator.setA(Integer.parseInt(expression[0]));
            calculator.setSign(expression[1].charAt(0));
            calculator.setB(Integer.parseInt(expression[2]));

            System.out.println(calculator.calculate());

            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Would you like to continue computing? [yes/no]:");
                answer = scanner.nextLine();
            }
        } while (!answer.equals("no"));
    }
}