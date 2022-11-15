package com.example.lesson1;

import java.util.Arrays;

public class HomeworkArray {

    public static void task1() {
        String[] array = {"TViMS", "I", "do", "not", "love"};
        System.out.println("Неотсортированный массив\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив\n" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        task1();
    }
}
