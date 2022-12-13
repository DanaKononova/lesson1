package com.example.lessons.lesson12_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Practise1 {
    private static HashMap<String, Product> toy = new HashMap<>();
    private static HashSet<String> numbers = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void printPairsKeyValue(){
        for (Map.Entry<String, Product> t: toy.entrySet()) {
            System.out.println(t.getKey() + "  " + t.getValue().getPrice());
        }
    }

    public static void printKeys() {
        for (String t: toy.keySet()) {
            System.out.println(t);
        }
    }

    public static void printValues() {
        for (Product t: toy.values()) {
            System.out.println(t.getPrice());
        }
    }

    public static void numberRow() {
        String numberS;
        do {
            System.out.println("Введите числа, ! - если хотите остановиться");
            numberS = scanner.next();
            try {
                Integer.parseInt(numberS);
                if (numberS.charAt(0) != '!') {
                    numbers.add(numberS);
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Повторите попытку");
            }
        } while (numberS.charAt(0) != '!');
        System.out.println(numbers.toString());
    }

    public static void main(String[] args) {
        toy.put("крыса белая", new Product("12"));
        toy.put("крыса серая", new Product("11,5"));
        toy.put("крыса чёрная с белым пятном", new Product("13"));
        //printPairsKeyValue();
        //printKeys();
        //printValues();
        numberRow();
    }
}
