package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private int count;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        hiddenNumber = (int) (Math.random() * 100 + 1);
        player1.cleanNumbers(count);
        player2.cleanNumbers(count);
        count = 0;
        System.out.println("Each player has 10 attempts: ");
        for (int i = 0; i < 10; i++) {
            if (isGuessed(player1)) {
                break;
            }
            if (isGuessed(player2)) {
                break;
            }
            count++;
        }
        printNumbers(player1);
        System.out.println();
        printNumbers(player2);
    }

    private boolean isGuessed(Player player) {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " enter the hidden number: ");
        player.setNumber(count, scanner.nextInt());

        if (player.getNumbers(count).length == 9) {
            System.out.println(player.getName() + " ran out of attempts");
        }

        if (player.getNumber(count) == hiddenNumber) {
            System.out.println("Win " + player.getName());
            System.out.println("Player " + player.getName() + " guessed the number " + player.getNumber(count)
                    + " with " + (count + 1) + " attempts");
            count++;
            result = true;
        } else if (player.getNumber(count) < hiddenNumber) {
            System.out.println(player.getName() + ": This number is less than what the computer guessed\n");
        } else if (player.getNumber(count) > hiddenNumber) {
            System.out.println(player.getName() + ": This number is greater than what the computer guessed\n");
        }
        return result;
    }

    private void printNumbers(Player player) {
        System.out.print(player.getName() + " entered: ");
        for (int number : player.getNumbers(count)) {
            System.out.print(number + " ");
        }
    }
}