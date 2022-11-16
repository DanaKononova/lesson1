package com.example.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class CrossesZeroes {
    public static int inputcheck() {
        String indS;
        int index;
        Scanner scan = new Scanner(System.in);
        boolean f = false;
        do {
            indS = scan.next();
            index = (int) indS.charAt(0);

            if (indS.length() > 1 || index > 51 || index < 49) {
                System.out.println("Неверный ввод");
                f = true;
            } else f = false;
        } while (f);
        return index - 48;
    }

    public static void crossesZeroes() {
        char[][] pole = new char[3][3];
        for (int i = 0; i < pole.length; i++) {
            Arrays.fill(pole[i], '*');
        }
        boolean isEndOfGame = true;
        boolean isArrayFull = false;
        int personNum = 1;
        int hodIteration = 0;
        char winElem = ' ';
        char currElem;
        int row, col;
        while (isEndOfGame) {
            System.out.println("Ход " + personNum + "-го игрока\n Введите номер строки и столбца элемента");

            do {
                row = inputcheck();
                col = inputcheck();
                if (pole[row - 1][col - 1] != '*') {
                    System.out.println("Клетка занята");
                }
            } while (pole[row - 1][col - 1] != '*');
            if (personNum == 1) {
                currElem = '+';
            } else currElem = '0';
            pole[row - 1][col - 1] = currElem;
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    System.out.print(pole[i][j] + " ");
                }
                System.out.println();
            }
            boolean isSameRow;
            for (int i = 0; i < pole.length; i++) {
                isSameRow = true;
                for (int j = 1; j < pole[i].length; j++) {
                    if (isSameRow) {
                        if (pole[i][j] == '*' || pole[i][j] != pole[i][j - 1]) {
                            isSameRow = false;
                        }
                    }
                }
                if (isSameRow) {
                    isEndOfGame = false;
                    winElem = pole[i][0];
                    break;
                }
            }
            if (isEndOfGame) {
                for (int j = 0; j < pole[0].length; j++) {
                    isSameRow = true;
                    for (int i = 1; i < pole.length; i++) {
                        if (isSameRow) {
                            if (pole[i][j] == '*' || pole[i][j] != pole[i - 1][j]) {
                                isSameRow = false;
                            }
                        }
                    }
                    if (isSameRow) {
                        isEndOfGame = false;
                        winElem = pole[0][j];
                        break;
                    }
                }
            }
            if (isEndOfGame) {
                isSameRow = true;
                for (int i = 1; i < pole.length; i++) {
                    if (isSameRow) {
                        if (pole[i][i] == '*' || pole[i][i] != pole[i - 1][i - 1]) {
                            isSameRow = false;
                        }
                    }
                }
                if (isSameRow) {
                    isEndOfGame = false;
                    winElem = pole[0][0];
                    break;
                }
            }
            if (isEndOfGame) {
                isSameRow = true;
                for (int i = 1; i < pole.length; i++) {
                    if (isSameRow) {
                        if (pole[pole.length - 1 - i][i] == '*' ||
                                pole[pole.length - 1 - i][i] != pole[pole.length - 1 - i + 1][i - 1]) {
                            isSameRow = false;
                        }
                    }
                }
                if (isSameRow) {
                    isEndOfGame = false;
                    winElem = pole[pole.length - 1][0];
                    break;
                }
            }
            hodIteration++;
            isArrayFull = true;
            for (int i = 0; i < pole.length; i++) {
                for (int j = 0; j < pole[i].length; j++) {
                    if (pole[i][j] == '*') {
                        isArrayFull = false;
                    }
                }
            }
            if (isArrayFull) {
                break;
            }
            if (isEndOfGame) {
                if (hodIteration % 2 == 0) {
                    personNum = 1;
                } else personNum = 2;
            }
        }
        if (isArrayFull) {
            System.out.println("Победила ничья");
        } else System.out.println(personNum + " игрой победил - это " + winElem);
    }

    public static void main(String[] args) {
        crossesZeroes();
    }
}
