package com.startjava.lesson2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Avenger");
        jaeger1.setMark("Mark-6");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(81.77f);
        jaeger1.setWeight(2.004f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(7);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.plasmaCaster();
        System.out.println("Jaeger Model: " + jaeger1.getModelName() + ". Mark: " + jaeger1.getMark() + ". Origin: " + jaeger1.getOrigin());
        System.out.println("Jaeger Characters: " + "Height: " + jaeger1.getHeight() + ". Weight: " + jaeger1.getWeight() + ". Strength: " + jaeger1.getStrength() + ". Armor: " + jaeger1.getArmor());
        System.out.println("Enter on drift :" + jaeger1.drift() + ". " + jaeger1.move() + ". " + jaeger1.scanKaiju() + ". Weapon " + jaeger1.plasmaCaster() + ".");
        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Guardian Bravo");
        jaeger2.setMark("Mark=6");
        jaeger2.setOrigin("USA");
        jaeger2.setHeight(73.21f);
        jaeger2.setWeight(1.975f);
        jaeger2.setStrength(8);
        jaeger2.setArmor(9);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger1.plasmaCaster();
        System.out.println("\nJaeger Model: " + jaeger2.getModelName() + ". Mark: " + jaeger2.getMark() + ". Origin: " + jaeger2.getOrigin());
        System.out.println("Jaeger Characters: " + "Height: " + jaeger2.getHeight() + ". Weight: " + jaeger2.getWeight() + ". Strength: " + jaeger2.getStrength() + ". Armor: " + jaeger2.getArmor());
        System.out.println("Enter on drift :" + jaeger2.drift() + ". " + jaeger2.move() + ". " + jaeger2.scanKaiju() + ". Weapon " + jaeger2.plasmaCaster() + ".");
    }
}