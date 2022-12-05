package com.example.lessons.lesson9_String;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet");
        String alphabet = scanner.next();
        alphabet.trim();
        if (!(alphabet.startsWith("a") || alphabet.startsWith("A"))) System.out.println("Неверное начало");
        else if (!(alphabet.regionMatches(1,"bcdefghijklmnopqrstuvwxy", 0, 24))) System.out.println("Неверная середина");
            else if (!(alphabet.endsWith("z")||alphabet.endsWith("Z"))) System.out.println("Неверный конец");
    }
}
