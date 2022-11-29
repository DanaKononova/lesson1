package com.example.lessons.lesson8.practise;

import java.util.Random;
import java.util.Scanner;

public class Birzha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String[] names = {"Andrey", "Artem", "Nikita", "Dima", "Roma", "Dana", "Dasha", "Kirill", "Pasha"};
        System.out.println("Input size");
        int size = scan.nextInt();
        Worker[] worker = new Worker[size];
        int workRandom, nameRandom, age, experience;
        for (int i = 0; i < size; i++) {
            workRandom = random.nextInt(4)+1;
            nameRandom = random.nextInt(9);
            age = random.nextInt(30)+1;
            experience = random.nextInt(10)+1;
            switch (workRandom) {
                case 1:{
                    worker[i] = new Pilot(names[nameRandom], age, "Pilot", experience);
                    break;
                }
                case 2:{
                    worker[i] = new Programmer(names[nameRandom], age, "Programmer", experience);
                    break;
                }
                case 3:{
                    worker[i] = new Teacher(names[nameRandom], age, "Teacher", experience);
                    break;
                }
                case 4:{
                    worker[i] = new Doctor(names[nameRandom], age, "Doctor", experience);
                    break;
                }
            }
            System.out.println("My name is "+worker[i].getName()+" My age is "+worker[i].getAge()+" I am a "+worker[i].getSpecialization()
            +" My experience is "+ worker[i].getExperience());
        }
    }
}
