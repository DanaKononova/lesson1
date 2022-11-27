package com.example.lessons.oop7;

import java.util.Random;
import java.util.Scanner;

public class HomeProgram {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static SimCard[] generateCards() {
        int arraySize = random.nextInt(10) + 1;
        SimCard[] simCards = new SimCard[arraySize];
        String number;
        int balance, operator, pinCode;
        System.out.println("Информация о доступных симках:");
        for (int i = 0; i < arraySize; i++) {
            number = "" + (random.nextInt(1000000) + 1000000);
            balance = random.nextInt(8);
            operator = random.nextInt(3) + 1;
            pinCode = (random.nextInt(9) + 1) * 1111;
            switch (operator) {
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
        return simCards;
    }

    public static int comandNumberCheck() {
        int comandNumber;
        String comandNumberS;
        boolean isInputCorrect;
        do {
            isInputCorrect = true;
            comandNumberS = scan.next();
            comandNumber = (int) comandNumberS.charAt(0);
            if (comandNumberS.length() > 1 || comandNumber > 57 || comandNumber < 49) {
                System.out.println("Неверный ввод. Повторите попытку");
                isInputCorrect = false;
            }
        } while (!isInputCorrect);
        return comandNumber - 48;
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
        } while (!isInputCorrect);
        return number;
    }

    public static int numberCheck() {
        String numberS;
        int number = 0;
        boolean isInputCorrect;
        do {
            isInputCorrect = true;
            numberS = scan.next();
            try {
                number = Integer.parseInt(numberS);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Повторите попытку");
                isInputCorrect = false;
            }
        } while (!isInputCorrect);
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Виртуальный телефон. Включите телефон, чтобы начать работу");
        boolean isPhoneOn = false;
        Phone phone = new Phone(null);
        SimCard[] simCards = generateCards();
        int comandNumber;
        String number;
        int cardNumber;
        boolean isSimAvaliable;
        do {
            System.out.println("Введите 1, чтобы включить телефон");
            System.out.println("Введите 2, чтобы вставить симку");
            System.out.println("Введите 3, чтобы показать симки");
            System.out.println("Введите 4, чтобы позвонить");
            System.out.println("Введите 5, чтобы принять вызов");
            System.out.println("Введите 6, чтобы вывести баланс на телефоне");
            System.out.println("Введите 7, чтобы вывести информацию о телефоне");
            System.out.println("Введите 8, чтобы выключить телефон");
            System.out.println("Введите 9, чтобы закончить работу программы");
            System.out.println("\n*если сим-карта заблокирована, выключите телефон и включите, затем введите заново");
            comandNumber = comandNumberCheck();

            switch (comandNumber) {
                case 1: {
                    if (phone.getSim() == null) {
                        System.out.println("Сначала вставьте сим-карту");
                    } else if (phone.isPhoneOn()) {
                        System.out.println("Телефон уже включён");
                    } else phone.phoneOn();
                    break;
                }
                case 2: {
                    System.out.println("Выберите номер карты из доступных, которую хотите вставить. Для этого вызовите команду 3.");
                    cardNumber = numberCheck();
                    isSimAvaliable = false;
                    for (int i = 0; i < simCards.length; i++) {
                        if (cardNumber == i + 1) {
                            phone.insertNewSim(simCards[i]);
                            isSimAvaliable = true;
                            break;
                        }
                    }
                    if (!isSimAvaliable) System.out.println("Нет такой симки");
                    break;
                }
                case 3: {
                    System.out.println("Информация о доступных сим-картах");
                    for (int i = 0; i < simCards.length; i++) {
                        System.out.print((i + 1) + "-я карта: ");
                        simCards[i].simCardInfo();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер телефона, на который хотите звонить с кодом оператора (33-А1, 29-Мтс, 44- Life)");
                    number = phoneNumberCheck();
                    phone.makeCall(number);
                    break;
                }
                case 5: {
                    System.out.println("Введите номер телефона, с которого хотите принять вызов с кодом оператора (33-А1, 29-Мтс, 44- Life)");
                    number = phoneNumberCheck();
                    phone.recieveCall(number);
                    break;
                }
                case 6: {
                    phone.printBalance();
                    break;
                }
                case 7: {
                    phone.printInfo();
                    break;
                }
                case 8: {
                    phone.phoneOff();
                    break;
                }
                case 9: {
                    System.out.println("До свидания!");
                    break;
                }
                default:
                    break;
            }
        } while (comandNumber != 8);
    }
}
