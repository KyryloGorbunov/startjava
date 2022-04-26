package com.startjava.lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNumber = (int) (Math.random() * 100 + 1);
    private int count;
    private boolean win;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {

        hiddenNumber = (int) (Math.random() * 100 + 1);
        count = 0;
        win = false;
        System.out.println("Each player has 10 attempts: ");
        do {
            numberEntry(player1);
            if (win) {
                break;
            }
            numberEntry(player2);
            count++;
        } while (count < player1.getNumbers().length && !win);

        outputOfNumbers(player1);
        outputOfNumbers(player2);
    }

    private void numberEntry(Player player) {
        int[] playerNumbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " enter the hidden number: ");
        player.setNumber(scanner.nextInt());
        player.setNumbers(count, player.getNumber());

        if ((count + 1) == playerNumbers.length) {
            System.out.println(player.getName() + " ran out of attempts");
        }

        if (player.getNumber() == hiddenNumber) {
            System.out.println("Win " + player.getName());
            System.out.println("Player " + player.getName() + " guessed the number " + player.getNumber() + " with " + (count + 1) + " attempts");
            win = true;
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println(player.getName() + ": This number is less than what the computer guessed\n");
        } else if (player.getNumber() > hiddenNumber) {
            System.out.println(player.getName() + ": This number is greater than what the computer guessed\n");
        }
    }

    private void outputOfNumbers(Player player) {
        int[] numbersPlayerCopy = Arrays.copyOf(player.getNumbers(), count);
        System.out.println(player.getName() + " entered: " + Arrays.toString(numbersPlayerCopy));
        Arrays.fill(numbersPlayerCopy, 0, count, 0);
        player.setNumbers(numbersPlayerCopy);
    }
}