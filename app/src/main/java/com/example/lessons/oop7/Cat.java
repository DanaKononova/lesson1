package com.example.lessons.oop7;

public class Cat extends Animal {
    private String catsColor;

    public String getCatsColor() {
        return catsColor;
    }

    public void setCatsColor(String catsColor) {
        this.catsColor = catsColor;
    }

    public Cat(String catsColor) {
        super("Fish", "Street", "Cat");
        setCatsColor(catsColor);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat's sound");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Cat sound: meow meow");
    }
}
