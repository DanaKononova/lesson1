package com.example.lessons.classes6;

import java.util.Scanner;

public class Audi extends Car {
    String model;

    public Audi(String marka, String model) {
        super(marka);
        this.model = model;
    }

    @Override
    public void console() {
        super.console();
        System.out.println(", модель машины " + this.model);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String marka = scan.next();
        String model = scan.next();
        Audi mashina = new Audi(marka, model);
        mashina.console();
    }
}
