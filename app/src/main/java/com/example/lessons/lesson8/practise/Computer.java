package com.example.lessons.lesson8.practise;

public class Computer implements InOutInterface{
    @Override
    public void print() {
        System.out.println("Print ...");
    }

    @Override
    public void write() {
        System.out.println("Write ...");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.print();
        computer.write();
    }
}
