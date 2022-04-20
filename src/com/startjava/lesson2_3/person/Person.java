package com.startjava.lesson2_3.person;

public class Person {

    String gender = "male";
    String name = "Oleg";
    float height = 1.80f;
    int weight = 83;
    int age = 30;

    void walk() {
        System.out.println("Im walking");
    }

    boolean sit() {
        System.out.println("Im sit down");
        return true;
    }

    void run() {
        System.out.println("I run at a speed 8 km/h");
    }

    String say() {
        return "Hello";
    }

    boolean learnJava() {
        System.out.println("Im learning Java");
        return true;
    }
}