package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray2 {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void task3() {
        int[][] matrix;
        System.out.println("Введите размерность двумерного массива:");
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        matrix = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = random.nextInt(15)+1;
            }
        }
        System.out.println("Двумерный массив:\n"+ Arrays.deepToString(matrix));
        System.out.println("Введите число:");
        int number = scan.nextInt();
        int index1 = 0;
        int index2 = 0;
        boolean isFound = false;
        System.out.println("Элементы массива до тех пор, пока не встретится число, которое делится нацело на введённое");
        do{
            if (matrix[index1][index2] % number == 0) {
                isFound = true;
            }
            System.out.println(matrix[index1][index2++]);
            if (index2 == size2) {
                index1++;
                index2 = 0;
            }
        } while (!isFound && index1 < size1 && index2 < size2);
        if (isFound ) {
            System.out.println("Найден искомый элемент");
        } else System.out.println("Искомый элемент не найден");
    }

    public static void main(String[] args) {
        task3();
    }
}
