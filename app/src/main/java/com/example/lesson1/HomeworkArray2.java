package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkArray2 {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static String[] numbers = {"one", "two","three","four","five","six","seven","eight","nine","ten"};

    public static void task2() {
        int[][][] threeDimensional;
        String[][][] threeDimensionalWords;
        System.out.println("Введите размерности трёхмерного массива:");
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        int size3 = scan.nextInt();
        threeDimensional = new int[size1][size2][size3];
        threeDimensionalWords = new String[size1][size2][size3];
        for(int i = 0; i< size1; i++) {
            for(int j = 0; j < size2; j++) {
                for(int k = 0; k < size3; k++) {
                    threeDimensional[i][j][k] = random.nextInt(10) + 1;
                    threeDimensionalWords[i][j][k] = numbers[threeDimensional[i][j][k]-1];
                }
            }
        }
        System.out.println("Трёхмерный массив\n"+ Arrays.deepToString(threeDimensional));
        System.out.println("Представление массива в виде слов:\n"+Arrays.deepToString(threeDimensionalWords));
    }

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
        task2();
        task1();
    }
}
