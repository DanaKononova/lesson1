package com.example.lessons.lesson13_Functional_Programming;

import java.util.Optional;
import java.util.Scanner;

public class Practise {
    public static Integer enterNumber() {
        Scanner scanner = new Scanner(System.in);
        String numberS = scanner.next();
        try {
            return Integer.parseInt(numberS);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Integer number = enterNumber();
        Optional<Integer> optionalInt = Optional.ofNullable(number);
        boolean optNotNull = optionalInt.isPresent();
        if (optNotNull) {
            System.out.println(optionalInt.get());
        } else {
            System.out.println("Неверный ввод");
        }
    }
}
