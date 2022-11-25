package com.example.lessons.oop7;

import java.util.Random;
import java.util.Scanner;

public class HomeProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int arraySize = random.nextInt(10)+1;
        SimCard[] simCards = new SimCard[arraySize];
        String number;
        int balance, operator;
        for (int i = 0; i < arraySize; i++) {
            number  = ""+(random.nextInt(1000000) + 1000000);
            balance = random.nextInt(8);
            operator = random.nextInt(3)+1;
            switch (operator){
                case 1: {
                    simCards[i] = new A1SimCard(number, balance);
                    break;
                }
                case 2: {
                    simCards[i] = new LifeSimCard(number, balance);
                    break;
                }
                case 3: {
                    simCards[i] = new MtsSimCard(number, balance);
                    break;
                }
            }
        }

        Phone phone = new Phone(new A1SimCard("5903599", 8));
        phone.printInfo();
        for (int i = 0; i< arraySize; i++) {
            phone.insertNewSim(simCards[i]);
            if (i % 2 == 0) {
                System.out.println("Введите номер телефона, на который будете звонить");
                number = scan.next();
                phone.makeCall(number);
            } else{
                System.out.println("Введите номер телефона, с которого будете принимать звонок");
                number = scan.next();
                phone.recieveCall(number);
            }
            phone.printBalance();
        }
    }
}
