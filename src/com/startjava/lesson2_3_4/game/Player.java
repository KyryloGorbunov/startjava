package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public void cleanNumbers(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}