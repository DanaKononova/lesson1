package com.example.lessons.lesson14;

import java.util.Scanner;

public class Minibus implements Runnable{
    QueueToMinibus minibus;

    public Minibus(QueueToMinibus minibus) {
        this.minibus = minibus;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько мест в маршрутке");
        int peoples = scanner.nextInt();
        for (int i = 0; i < peoples; i++) {
            minibus.get(1);
        }
    }
}
