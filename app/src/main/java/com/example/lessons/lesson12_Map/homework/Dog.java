package com.example.lessons.lesson12_Map.homework;

public class Dog extends Pet {
    private String purpose;

    public Dog(String name, String breed, String purpose) {
        super(name, breed);
        this.purpose = purpose;
    }

    @Override
    public void printInfo() {
        System.out.println(" "+getName()+", Dog's breed: "+getBreed()+", Dog's gender: "+this.purpose);
    }
}
