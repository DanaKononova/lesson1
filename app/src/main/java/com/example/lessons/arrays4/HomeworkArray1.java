package com.example.lessons.arrays4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray1 {
    public static void task3() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив чисел\n" + Arrays.toString(array));
        System.out.println("Введите число, которое хотите удалить из массива");
        int deleteNum = scan.nextInt();
        boolean isNumInArray = false;
        int size2 = 0;
        for (int a: array) {
            if (a == deleteNum) {
                isNumInArray = true;
            } else size2++;
        }
        if (isNumInArray) {
            int[] array2 = new int[size2];
            int index2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != deleteNum) {
                    array2[index2++] = array[i];
                }
            }
            System.out.println("Массив без данного числа\n" + Arrays.toString(array2));
        } else System.out.println("В массиве нет такого числа");
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean isSizeCorrect = false;
        int size;
        do {
            System.out.println("Введите размер массива");
            size = scan.nextInt();
            if (size > 5 && size <= 10) {
                isSizeCorrect = true;
            }
            else
                System.out.println("Неверный размер");
        } while (!isSizeCorrect);

        int size2 = 0;
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(100);
            if (array1[i] % 2 == 0) {
                size2++;
            }
        }
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[size2];
        int index2 = 0;
        for (int i = 0; i < size; i++) {
            if (array1[i] % 2 == 0) {
                array2[index2++] = array1[i];
            }
        }
        System.out.println("Массив из чётных чисел предыдущего массива:");
        System.out.println(Arrays.toString(array2));

    }

    public static void task1() {
        String[] array = {"TViMS", "I", "do", "not", "love"};
        System.out.println("Неотсортированный массив\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив\n" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        task3();
        task2();
        task1();
    }
}
