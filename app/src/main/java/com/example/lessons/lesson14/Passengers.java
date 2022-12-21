package com.example.lessons.lesson14;

import java.util.Scanner;

public class Passengers implements Runnable{
    QueueToMinibus minibus;

    public Passengers(QueueToMinibus minibus) {
        this.minibus = minibus;
    }

    public void run() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите сколько новых людей пришло в очередь");
        //int peoples = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            minibus.put(10);
        }
    }
}
