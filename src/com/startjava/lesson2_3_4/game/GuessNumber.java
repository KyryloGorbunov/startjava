package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        initGame();
        System.out.println("Each player has 10 attempts: ");
        for (int i = 0; i < 10; i++) {
            if (isGuessed(player1)) {
                break;
            }
            if (isGuessed(player2)) {
                break;
            }
            Player.count++;
        }
        printNumbers(player1);
        printNumbers(player2);
    }

    public void initGame() {
        hiddenNumber = (int) (Math.random() * 100 + 1);
        player1.toIndex();
        player2.toIndex();
    }

    private boolean isGuessed(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " enter the hidden number: ");
        player.setNumber(scanner.nextInt());
        System.out.println(player.getNumber());

        if (player.getNumber() == hiddenNumber) {
            System.out.println("Win " + player.getName());
            System.out.println("Player " + player.getName() + " guessed the number " + player.getNumber() + " with "
                    + (Player.count + 1) + " attempts");
            Player.count++;
            return true;
        }
        System.out.println(player.getName() + ": This number is" + (player.getNumber() < hiddenNumber ? " less " :
                " greater ") + "than the computer guessed\n");
        return false;
    }

    private void printNumbers(Player player) {
        System.out.print(player.getName() + " entered: ");
        for (int number : player.newLength()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}