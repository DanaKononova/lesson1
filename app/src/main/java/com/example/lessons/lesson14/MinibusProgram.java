package com.example.lessons.lesson14;

import java.util.Scanner;

public class MinibusProgram {
    public static void main(String[] args) {

        QueueToMinibus queueToMinibus = new QueueToMinibus();
        Minibus minibus = new Minibus(queueToMinibus);
        Passengers passengers = new Passengers(queueToMinibus);

        new Thread(minibus).start();
        new Thread(passengers).start();
    }
}
