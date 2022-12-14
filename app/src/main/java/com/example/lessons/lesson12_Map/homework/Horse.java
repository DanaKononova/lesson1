package com.example.lessons.lesson12_Map.homework;

public class Horse extends Pet{
    private String color;

    public Horse(String name, String breed, String color) {
        super(name, breed);
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.println(" "+getName()+", Horse's breed: "+getBreed()+", Horse's gender: "+this.color);
    }
}
