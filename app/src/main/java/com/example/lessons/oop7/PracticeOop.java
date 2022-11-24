package com.example.lessons.oop7;

public class PracticeOop {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("20sm");
        animals[1] = new Cat("wild");
        animals[2] = new Duck("Braslavskoe");
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }

        Student[] students = new Student[3];
        students[0] = new Student("Dana", "Kononova", "151001", 8.9);
        students[1] = new Student("Andrey", "Berezkin", "151001", 8.9);
        students[2] = new Aspirant("Dasha", "Zaitseva", "151002", 4.9, "Aktios");
        for (Student student: students) {
            System.out.println(student.getSchoolarShip());
        }
    }
}
