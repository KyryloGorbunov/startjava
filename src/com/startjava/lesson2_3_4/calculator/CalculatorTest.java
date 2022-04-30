package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter a mathematical expression: ");
            String mathOperation = scanner.nextLine();
            System.out.println(calculator.calculate(mathOperation));
            do {
                System.out.println("Would you like to continue computing? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}