package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int[] numbers) {
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int index, int number) {
        numbers[index] = number;
    }
}