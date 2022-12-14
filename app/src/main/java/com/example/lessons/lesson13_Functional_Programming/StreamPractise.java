package com.example.lessons.lesson13_Functional_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPractise {
    public static void employeeSurname() {
        List<String> employeeSurname = new ArrayList<>();
        employeeSurname.add("aa");
        employeeSurname.add("bb");
        employeeSurname.add("ccc");
        employeeSurname.add("cdd");
        employeeSurname.add("cee");
        employeeSurname.add("cff");

        for( String employee: employeeSurname) {
            System.out.println(employee);
        }
        List<String> filtredList = employeeSurname.stream()
                .filter(name -> name.startsWith("j"))
                .collect(Collectors.toList());
        System.out.println("\nSurnames that starts with j:");
        for( String employee: filtredList) {
            System.out.println(employee);
        }
    }

    public static void generatedNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for( Integer number: numbers) {
            System.out.println(number);
        }
        List<Integer> filtredList = numbers.stream()
                .filter(numb -> numb % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nEven numbers amount");
        System.out.println(filtredList.size());

        Predicate<Integer> predicate = numb -> numb % 2 == 0;
        List<Integer> predicateList = numbers.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println("\nEven numbers amount");
        System.out.println(filtredList.size());
    }

    public static void main(String[] args) {
        employeeSurname();
        generatedNumbers();
    }
}
