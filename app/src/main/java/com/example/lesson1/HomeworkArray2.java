package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray2 {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    public static void task1() {
        int[][] matrix;
        System.out.println("Введите размеры двумерного массива. Сначала строки, потом столбцы");
        int row = scan.nextInt();
        int col = scan.nextInt();
        matrix = new int[row][col];
        int[] array = new int[row*col];
        int indArray = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(20);
                array[indArray++] = matrix[i][j];
            }
        }
        System.out.println("Двумерный массив:");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Одномерный массив с элементами двумерного:");
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        task1();
    }
}
