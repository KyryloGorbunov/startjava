package com.startjava.lesson2_3.animal;

public class Wolf {

    private String gender = "male";
    private String nickname = "Bimbo";
    private int weight = 35;
    private int age = 8;
    private String color = "Grey";

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Moving");
    }

    public void sit() {
        System.out.println("Sitting");
    }

    public void run() {
        System.out.println("Running");
    }

    public void howl() {
        System.out.println("Howling");
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}