package com.example.lessons.classes6;

import java.util.Scanner;

public class CreditCard {
    int countNumber;
    float currentSum;

    public CreditCard(int countNumber, float currentSum) {
        this.countNumber = countNumber;
        this.currentSum = currentSum;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public float getCurrentSum() {
        return currentSum;
    }

    public void addSumOnCard(float addSum) {
        this.currentSum += addSum;
    }

    public void getSomeSumFromCard(float takenSum) {
        if (getCurrentSum() - takenSum >= 0) {
            this.currentSum -= takenSum;
        } else System.out.println("Недостаточно средств");
    }

    public void getInformation() {
        System.out.println("Номер счёта карты: " + getCountNumber());
        System.out.println("Текущая сумма на карте: " + getCurrentSum());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод информации о картах");
        CreditCard[] cards = new CreditCard[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("Карта " + i + "\nВведите номер счёта и начальную сумму на карте");
            int accountNumber = scan.nextInt();
            float startSum = scan.nextFloat();
            cards[i - 1] = new CreditCard(accountNumber, startSum);
        }

        System.out.println("\nИнформация о картах");
        cards[0].getInformation();
        cards[1].getInformation();
        cards[2].getInformation();

        System.out.print("\nДобавьте сумму на первую карту ");
        float addSum = scan.nextFloat();
        cards[0].addSumOnCard(addSum);
        System.out.print("Добавьте сумму на вторую карту ");
        addSum = scan.nextFloat();
        cards[1].addSumOnCard(addSum);
        System.out.print("Удалите сумму с третьей карту ");
        float deleteSum = scan.nextFloat();
        cards[2].getSomeSumFromCard(deleteSum);

        System.out.println("\nИнформация о картах");
        cards[0].getInformation();
        cards[1].getInformation();
        cards[2].getInformation();
    }
}
