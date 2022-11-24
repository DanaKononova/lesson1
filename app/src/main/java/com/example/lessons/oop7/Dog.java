package com.example.lessons.oop7;

public class Dog extends Animal {
    private String dogsTailsLengths;

    public String getDogsTailsLengths() {
        return dogsTailsLengths;
    }

    public void setDogsTailsLengths(String dogsTailsLengths) {
        this.dogsTailsLengths = dogsTailsLengths;
    }

    public Dog(String dogsTailsLengths) {
        super("Meat", "Yard", "Dog");
        setDogsTailsLengths(dogsTailsLengths);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog's sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog sound: gaf gaf");
    }
}
