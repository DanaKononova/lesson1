package com.example.lessons.oop7;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getAnimalType()+"'s food: "+ animal.getFood()+", animal's location: "+animal.getLocation());
    }
}
