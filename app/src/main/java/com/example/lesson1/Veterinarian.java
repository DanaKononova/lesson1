package com.example.lesson1;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getAnimalType()+"'s food: "+ animal.getFood()+", animal's location: "+animal.getLocation());
    }
}
