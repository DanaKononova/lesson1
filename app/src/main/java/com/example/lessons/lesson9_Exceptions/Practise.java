package com.example.lessons.lesson9_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practise {
    public static void exception() throws NullPointerException {
        String word = null;
        throw new NullPointerException("null");
    }

    public static void main(String[] args) {
        exception();
        Scanner scanner = new Scanner(System.in);
        char[] array = {'a', 'b', 'c', 'd', 'f', 'g'};
        int i;
        boolean isGood;
        do {
            try {
                isGood = true;
                System.out.println("Input index");
                i = scanner.nextInt();
                System.out.println(array[i]);
            } catch (IndexOutOfBoundsException e1) {
                isGood = false;
                System.out.println("Индекс за границами массива. Границы от 0 до " + (array.length - 1));
            } catch (InputMismatchException e2) {
                isGood = false;
                System.out.println("Неверный ввод");
                scanner.next();
            } catch (Exception e3) {
                isGood = false;
                System.out.println("Неизвестная ошибка");
                scanner.next();
            }
        } while (!isGood);
        System.out.println("Конец");
    }
}
