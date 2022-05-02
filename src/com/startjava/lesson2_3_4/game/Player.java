package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    public static int count;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[count];
    }

    public void setNumber(int number) {
        if (count == numbers.length - 1) {
            System.out.println(getName() + " ran out of attempts");
        }
        numbers[count] = number;
    }

    public int[] newLength() {
        return Arrays.copyOf(numbers, count);
    }

    public void toIndex() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}