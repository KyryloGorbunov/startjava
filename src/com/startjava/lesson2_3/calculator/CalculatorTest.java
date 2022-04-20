package com.startjava.lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter the first number: ");
            calculator.setA(scanner.nextFloat());
            System.out.println("Enter the sign of the mathematical operation: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Enter the second number: ");
            calculator.setB(scanner.nextFloat());
            System.out.println(calculator.calculate());
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Would you like to continue computing? [yes/no]:");
                answer = scanner.nextLine();
            }
        } while (!answer.equals("no"));
    }
}