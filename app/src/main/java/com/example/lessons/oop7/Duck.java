package com.example.lessons.oop7;

public class Duck extends Animal {
    private String ducksLake;

    public String getDucksLake() {
        return ducksLake;
    }

    public void setDucksLake(String ducksLake) {
        this.ducksLake = ducksLake;
    }

    public Duck(String ducksLake) {
        super("Feed", "Lake", "Duck");
        setDucksLake(ducksLake);
    }

    @Override
    public void makeNoise() {
        System.out.println("Duck's sound");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleeps");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Duck sound: quack quack");
    }
}
