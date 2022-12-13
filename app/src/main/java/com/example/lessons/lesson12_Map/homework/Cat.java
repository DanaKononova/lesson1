package com.example.lessons.lesson12_Map.homework;

public class Cat extends Pet {
    private String gender;

    public Cat(String name, String breed, String gender) {
        super(name, breed);
        this.gender = gender;
    }

    @Override
    public void printAbout() {
        System.out.println(" "+getName()+", Cat's breed: "+getBreed()+", Cat's gender: "+this.gender);
    }
}
