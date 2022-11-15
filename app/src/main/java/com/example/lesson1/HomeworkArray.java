package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray {
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

    public static void main(String[] args) {
        task2();
    }
}
