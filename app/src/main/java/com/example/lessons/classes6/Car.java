package com.example.lessons.classes6;

public class Car {
    String marka;

    public Car(String marka) {
        this.marka = marka;
    }

    public void console() {
        System.out.print("Я машина "+this.marka);
    }
}
