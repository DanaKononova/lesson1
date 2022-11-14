package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class ArrayStudy {
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Введите индекс");
        int ind = scan.nextInt();
        if (ind >= 0 && ind < array.length) {
            System.out.println(array[ind]);
        } else System.out.println("Слишком большой индекс");
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = scan.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = i + 1;
        }
        System.out.println(Arrays.toString(array1));
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            array2[j++] = array1[i];
        }
        for(int i = 0; i < size/2; i++) {
            int tmp = array1[size-i-1];
            array1[size-i-1] = array1[i];
            array1[i] = tmp;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array1));
    }

    public static void task3() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = scan.nextInt();
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
           array2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }
}
