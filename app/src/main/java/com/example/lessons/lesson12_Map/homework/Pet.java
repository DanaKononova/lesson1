package com.example.lessons.lesson12_Map.homework;

public abstract class Pet {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void printAbout(){
    }
}
