package com.example.lesson1;

import java.util.Scanner;

public class Lesson {
    public static void printSumma(int a) {
        switch (a) {
            case 1:
                System.out.println("this is 1");
                break;
            case 2:
                System.out.println("this is 2");
                break;
            default:
                System.out.println("this is other");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        printSumma(a);
    }
}
