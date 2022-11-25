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
            System.out.println("Введите номер " + (i+1)+"-й симки");
            number  = scan.next();
            balance = random.nextInt(15);
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
        System.out.println("Ваш телефон:");
        System.out.println("Номер новой карты: "+ phone.getSim().getNumber()+"\nИмя оператора карты: "
                + phone.getSim().getOperatorName() +" Баланс симки: "+ phone.getSim().getBalance());
        for (int i = 0; i< arraySize; i++) {
            if (i % 2 == 0) {
                phone.makeCall(simCards[i].getNumber());
            } else phone.recieveCall(simCards[i].getNumber());
            phone.printBalance();
        }
    }
}
