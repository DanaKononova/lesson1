package com.example.lessons.lesson14.homework;

import java.util.Scanner;

public class Elevators {
    public static int amountInputCheck() {
        Scanner scanner = new Scanner(System.in);
        int amount = -1;
        do {
            String amountS = scanner.nextLine();
            try {
                amount = Integer.parseInt(amountS);
                if (amount <= 0) {
                    amount = -1;
                    System.out.println("Неверный ввод, повторите ещё раз");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, повторите ещё раз");
            }
        } while (amount == -1);
        return amount;
    }

    public static void main(String[] args) {
        System.out.println("Введите количество людей, которые пришли на площадку");
        int amount = amountInputCheck();

        QueueToElevator queue = new QueueToElevator(amount);
        BigElevator bigElevator = new BigElevator(queue);
        FastElevator fastElevator = new FastElevator(queue);

        new Thread(bigElevator).start();
        new Thread(fastElevator).start();
    }
}
