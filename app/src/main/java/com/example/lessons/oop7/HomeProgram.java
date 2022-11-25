package com.example.lessons.oop7;

import java.util.Random;
import java.util.Scanner;

public class HomeProgram {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void generateCards() {
        int arraySize = random.nextInt(10)+1;
        SimCard[] simCards = new SimCard[arraySize];
        String number;
        int balance, operator, pinCode;
        for (int i = 0; i < arraySize; i++) {
            number  = ""+(random.nextInt(1000000) + 1000000);
            balance = random.nextInt(8);
            operator = random.nextInt(3)+1;
            pinCode = (random.nextInt(10)+1) * 1111;
            switch (operator){
                case 1: {
                    simCards[i] = new A1SimCard(number, balance, pinCode);
                    break;
                }
                case 2: {
                    simCards[i] = new LifeSimCard(number, balance, pinCode);
                    break;
                }
                case 3: {
                    simCards[i] = new MtsSimCard(number, balance, pinCode);
                    break;
                }
            }
        }
        Phone phone = new Phone(new A1SimCard("5903599", 8, 1111));
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

    public static int comandNumberCheck() {
        int comandNumber;
        String comandNumberS;
        boolean isInputCorrect;
        do {
            isInputCorrect = true;
            comandNumberS = scan.next();
            comandNumber =  (int) comandNumberS.charAt(0);
            if (comandNumberS.length() > 1 || comandNumber > 56 || comandNumber < 49) {
                System.out.println("Неверный ввод. Повторите попытку");
                isInputCorrect = false;
            }
        } while(!isInputCorrect);
        return comandNumber-48;
    }

    public static String phoneNumberCheck() {
        String number;
        boolean isInputCorrect;
        do {
            isInputCorrect = true;
            number = scan.next();
            if (!(number.startsWith("33") || number.startsWith("29") || number.startsWith("44")) || number.length() != 9) {
                System.out.println("Неверный ввод. Повторите попытку");
                isInputCorrect = false;
            }
        } while(!isInputCorrect);
        return number;
    }

    public static int balanceCheck() {
        String balanceS;
        int balance = 0;
        boolean isInputCorrect;
        do {
            isInputCorrect = true;
            balanceS = scan.next();
            try {
                balance = Integer.parseInt(balanceS);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Повторите попытку");
                isInputCorrect = false;
            }
        } while(!isInputCorrect);
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Виртуальный телефон. Включите телефон, чтобы начать работу");
        boolean isPhoneOn = false;
        Phone phone = new Phone(null);
        int comandNumber;
        do{
            System.out.println("Введите 1, чтобы включить телефон");
            System.out.println("Введите 2, чтобы вставить симку");
            System.out.println("Введите 3, чтобы позвонить");
            System.out.println("Введите 4, чтобы принять вызов");
            System.out.println("Введите 5, чтобы вывести баланс на телефоне");
            System.out.println("Введите 6, чтобы вывести информацию о телефоне");
            System.out.println("Введите 7, чтобы выключить телефон");
            System.out.println("Введите 8, чтобы закончить работу программы");
            System.out.println("\n*если сим-карта заблокирована, выключите телефон и включите, затем введите заново");
            comandNumber = comandNumberCheck();

            String number;
            int balance, operator, pinCode;
            switch (comandNumber) {
                case 1: {
                    if (phone.getSim() == null) {
                        System.out.println("Сначала вставьте сим-карту");
                    } else phone.phoneOn();
                    break;
                }
                case 2: {
                    System.out.println("Введите информацию о карте:");
                    System.out.println("1: Введдите номер карты с кодом оператора (33-А1, 29-Мts, 44- Life)");
                    number = phoneNumberCheck();
                    System.out.println("2: Введдите баланс на карте");
                    balance = balanceCheck();
                    System.out.println("3: Введдите номер оператора карты (1, если это А1, 2 - Мts, 3 - Life)");
                    operator = scan.nextInt();
                    pinCode = (random.nextInt(10)+1) * 1111;
                    switch (operator) {
                        case 1: {
                            phone.insertNewSim(new A1SimCard(number, balance, pinCode));
                            break;
                        }
                        case 2: {
                            phone.insertNewSim(new MtsSimCard(number, balance, pinCode));
                            break;
                        }
                        case 3: {
                            phone.insertNewSim(new LifeSimCard(number, balance, pinCode));
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите номер телефона, на который хотите звонить с кодом оператора (33-А1, 29-Мтс, 44- Life)");
                    number = phoneNumberCheck();
                    phone.makeCall(number);
                    break;
                }
                case 4: {
                    System.out.println("Введите номер телефона, с которого хотите принять вызов с кодом оператора (33-А1, 29-Мтс, 44- Life)");
                    number = phoneNumberCheck();
                    phone.recieveCall(number);
                    break;
                }
                case 5: {
                    phone.printBalance();
                    break;
                }
                case 6: {
                    phone.printInfo();
                    break;
                }
                case 7: {
                    phone.phoneOff();
                    break;
                }
                case 8: {
                    System.out.println("До свидания!");
                    break;
                }
                default: break;
            }
        } while (comandNumber != 8);
    }
}
