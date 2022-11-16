package com.example.lesson1;

import java.util.Arrays;
import java.util.Random;
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
    public static void matrix() {
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[1][2] = 7;
        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] a1 = {1, 2,0};
        int[] a2 = {2, 1, 0};
        System.out.println(Arrays.equals(a1, a2));
    }
    public static void treeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры трёхмерного массива");
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int size3 = scanner.nextInt();
        int[][][] array = new int[size1][size2][size3];
        Random random = new Random();
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    array[i][j][k] = random.nextInt(20);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
    public static void shahmaty() {
        char[][] shahmat = new char[8][8];
        for (int i = 0; i < 8; i++) {
            int j = 0;
            while (j < 8) {
                if (i % 2 == 0) {
                    shahmat[i][j++] = 'W';
                    shahmat[i][j++] = 'B';
                } else {
                    shahmat[i][j++] = 'B';
                    shahmat[i][j++] = 'W';
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for(int j = 0; j<8; j++) {
                System.out.print(shahmat[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //matrix();
        //treeArray();
        shahmaty();
    }
}
