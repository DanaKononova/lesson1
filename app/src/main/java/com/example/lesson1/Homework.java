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

    public static void main(String[] args){
        task1();
    }
}
