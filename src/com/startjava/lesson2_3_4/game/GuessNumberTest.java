package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting game");
        System.out.print("Enter player1 name: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Enter player2 name: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.print("\nDo you want to continue the game? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}