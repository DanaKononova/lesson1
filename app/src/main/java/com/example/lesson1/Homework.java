package com.example.lesson1;

import java.util.Scanner;

public class Homework {
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println(n+" - чётное");
        } else {
            System.out.println(n+" - нечётное");
        }
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа:");
        float a = scan.nextFloat();
        float aModule = a < 0 ? (-1) * a : a;
        float b = scan.nextFloat();
        float bModule = b < 0 ? (-1) * b : b;
        float c = scan.nextFloat();
        float cModule = c < 0 ? (-1) * c : c;
        System.out.println("Меньшее по модулю число: ");
        if (aModule < bModule && aModule < cModule) {
            System.out.println(a);
        } else {
            if (bModule < cModule) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        switch (a) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            }
            case 7: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("Неизвестный день недели");
            }
        }
    }

    public static void main(String[] args){
        task1();
        task2();
        task3();
    }
}
