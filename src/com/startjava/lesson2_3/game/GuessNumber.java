package com.startjava.lesson2_3.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(player1.getName() + " enter the hidden number:");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == hiddenNumber) {
                System.out.println("Win " + player1.getName() + "\n");
                break;
            } else if (player1.getNumber() < hiddenNumber) {
                System.out.println(player1.getName() + ": This number is less than what the computer guessed\n");
            } else if (player1.getNumber() > hiddenNumber) {
                System.out.println(player1.getName() + ": This number is greater than what the computer guessed\n");
            }

            System.out.println(player2.getName() + " enter the hidden number:");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == hiddenNumber) {
                System.out.println("Win " + player2.getName() + "\n");
                break;
            } else if (player2.getNumber() < hiddenNumber) {
                System.out.println(player2.getName() + ": This number is less than what the computer guessed\n");
            } else if (player2.getNumber() > hiddenNumber) {
                System.out.println(player2.getName() + ": This number is greater than what the computer guessed\n");
            }
        } while (true);
    }
}