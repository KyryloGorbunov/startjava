package com.startjava.lesson1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100);
        int guessNumber = (int)(Math.random() * 100);
        boolean count = false;

        System.out.println("Computer guest: " + number);
        System.out.println("Enter the number: " + guessNumber);
        while (count == false) {
            if (guessNumber == number) {
                System.out.println(guessNumber + " = " + number);
                System.out.println("You are win!");
                count = true;
            } else if (guessNumber > number) {
                for (int i = guessNumber; i > number; i--) {
                    System.out.println(guessNumber +" This number is greater than what the computer guessed" );
                    guessNumber--;
                }
            } else if (guessNumber < number) {
                for (int i = guessNumber; i < number; i++) {
                    System.out.println(guessNumber + " This number is less than what the computer guessed");
                    guessNumber++;
                }
            } else {
                System.out.println("Wrong number entered");
            }
        }
    }
}