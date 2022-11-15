package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray {
    public static void task3() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив чисел\n" + Arrays.toString(array));
        System.out.println("Введите число, которое хотите удалить из массива");
        int n = scan.nextInt();
        boolean isInArray = false;
        int size2 = 0;
        for (int a: array) {
            if (a == n) {
                isInArray = true;
            } else size2++;
        }
        if (isInArray) {
            int[] array2 = new int[size2];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != n) {
                    array2[j++] = array[i];
                }
            }
            System.out.println("Массив без данного числа\n" + Arrays.toString(array2));
        } else System.out.println("В массиве нет такого числа");
    }

    public static void main(String[] args) {
        task3();
    }
}
