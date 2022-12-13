package com.example.lessons.lesson12_Map.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetCreation {
    private static HashMap<String, Pet> pets= new HashMap<>();

    public static void printInfo(){
        for (Map.Entry<String,Pet> pet: pets.entrySet()) {
            System.out.print(pet.getKey()+" ");
            pet.getValue().printAbout();
        }
    }

    public static void generatePets() {
        pets.put("Moris", new Cat("Кот", "abbisinets", "male"));
        pets.put("Persik", new Cat("Кот", "abbisinets", "male"));
        pets.put("Cat", new Cat("Кот", "dvornzshka", "female"));
        pets.put("Fifty", new Dog("Собака", "labrador", "security"));
        pets.put("Danka", new Horse("Лошадь", "poni", "female"));
    }

    public static void deletePet() {
        System.out.println("Введите имя животного, которое хотите удалить");
        Scanner scanner = new Scanner(System.in);
        String name;
        boolean isNameInMap;
        do{
            name = scanner.nextLine();
            isNameInMap = pets.containsKey(name);
            if (!isNameInMap) {
                System.out.println("Такого имени в списке нет. Повторите ввод");
            }
        }while (!isNameInMap);
        pets.remove(name);
        printInfo();
    }

    public static void main(String[] args) {
        generatePets();
        printInfo();
        deletePet();
    }
}
