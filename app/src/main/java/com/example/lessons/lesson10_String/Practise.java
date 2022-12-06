package com.example.lessons.lesson10_String;

import java.util.Scanner;

public class Practise {
    public static void doChecksWithInputString(String s) {
        System.out.println("Последний символ");
        System.out.println(s.charAt(s.length()-1));
        System.out.println("Проверка на !!!");
        System.out.println(s.endsWith("!!!"));
        System.out.println("Проверка на I like");
        System.out.println(s.startsWith("I like"));
        System.out.println("Проверка на содержание");
        System.out.println(s.contains("Java"));
        System.out.println("Позиция подстроки Java:");
        System.out.println(s.indexOf("Java"));
        System.out.println("Замена а на о");
        System.out.println(s.replace('a', 'o'));
        System.out.println("Верхний регистр");
        System.out.println(s.toUpperCase());
        System.out.println("Нижний регистр");
        System.out.println(s.toLowerCase());
        System.out.println("Вырезать Java");
        System.out.println(s.substring(0, s.indexOf("Java"))+ s.substring(s.indexOf("Java")+4));
    }

    public static void makeEquationsWithNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        StringBuilder s1 = new StringBuilder();
        s1.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber+secondNumber);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder();
        s2.append(firstNumber).append(" - ").append(secondNumber).append(" = ").append(firstNumber-secondNumber);
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder();
        s3.append(firstNumber).append(" * ").append(secondNumber).append(" = ").append(firstNumber*secondNumber);
        System.out.println(s3);

        System.out.println("Замена = на слово равно");
        s1.insert(s1.indexOf("="), "равно");
        s1.deleteCharAt(s1.indexOf("="));
        System.out.println(s1);
        s2.insert(s2.indexOf("="), "равно");
        s2.deleteCharAt(s2.indexOf("="));
        System.out.println(s2);
        s3.insert(s3.indexOf("="), "равно");
        s3.deleteCharAt(s3.indexOf("="));
        System.out.println(s3);

        System.out.println("Замена +, -, * на слова");
        s1.replace(s1.indexOf("+"), s1.indexOf("+")+1, "плюс");
        System.out.println(s1);
        s2.replace(s2.indexOf("-"), s2.indexOf("-")+1, "минус");
        System.out.println(s2);
        s3.replace(s3.indexOf("*"), s3.indexOf("*")+1, "умножить");
        System.out.println(s3);
    }
    public static void main(String[] args) {
        // doChecksWithInputString("I like Java!!!");
        makeEquationsWithNumbers();
    }
}
