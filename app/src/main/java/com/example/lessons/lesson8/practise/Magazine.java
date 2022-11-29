package com.example.lessons.lesson8.practise;

public class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println("Журнал напечатан");
    }

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.print();
    }
}
