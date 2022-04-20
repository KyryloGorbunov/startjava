package com.startjava.lesson2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("female");
        wolf.setNickname("Bonnie");
        wolf.setWeight(25);
        wolf.setAge(5);
        wolf.setColor("white");
        System.out.println("Gender: " + wolf.getGender() + "\nNickname: " + wolf.getNickname() + 
            "\nWeight: " + wolf.getWeight() + "\nAge: " + wolf.getAge() + "\nColor: " + wolf.getColor());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}