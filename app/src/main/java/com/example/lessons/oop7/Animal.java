package com.example.lessons.oop7;

public class Animal {
    private String food;
    private String location;
    private String animalType;

    public Animal(String food, String location, String animalType) {
        setAnimalType(animalType);
        setFood(food);
        setLocation(location);
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Sound of some animal");
    }

    public void eat() {
        System.out.println("Some animal eats");
    }

    public void sleep() {
        System.out.println("Some animal sleeps");
    }

    public void sound() {
        System.out.println("Animal's sounds");
    }
}
