package com.example.lessons.lesson13_Functional_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void realizeMain() {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите количество элементов коллекции");
        int amount = amountInputCheck();
        for (int i = 0; i < amount; i++) {
            numbers.add(random.nextInt(20));
        }
        System.out.println(numbers);

        System.out.println("Вывод чётных чисел в диапозоне от 7 до 17");
        Stream<Integer> filteredNumbers1 = numbers.stream()
                .distinct()
                .peek(numb -> printEvenInBounds(numb))
                .map(numb -> numb * 2)
                .filter(numb -> numb > 10)
                .peek(System.out::println);
        System.out.println("Удалены дубликаты, элементы умножены на 2 и оставлены только те, которые > 10");
        System.out.println(filteredNumbers1);
        long size = filteredNumbers1.count();
        System.out.println("Размер получившегося списка: " + size);
        double averageSum = filteredNumbers1.mapToDouble(numb -> numb).sum() / size;
        System.out.println("Среднее арифметическое оставшихся элементиов: " + averageSum);
    }

    public static void printEvenInBounds(Integer numb) {
        if (numb % 2 == 0 && numb >= 7 && numb <= 17) System.out.println(numb);
    }

    public static int amountInputCheck() {
        String amountS = scanner.next();
        int amount = -1;
        do {
            try {
                amount = Integer.parseInt(amountS);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, повторите ещё раз");
            }
        } while (amount == -1);
        return amount;
    }

    public static void main(String[] args) {
        realizeMain();
    }
}
