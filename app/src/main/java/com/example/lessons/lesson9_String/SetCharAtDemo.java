package com.example.lessons.lesson9_String;

public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        System.out.println("charAt(1) = "+ stringBuilder.charAt(1));
        stringBuilder.setCharAt(1, 'i');
        stringBuilder.setLength(2);
        System.out.println(stringBuilder);
    }
}
