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

    public static void main(String[] args) {
        task2();
    }
}
