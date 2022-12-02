package com.example.lessons.lesson9_Exceptions;

import java.util.Scanner;

public class Task1 {
    public static boolean isCorrect(String word) {
        int wordInt;
        boolean isCorrect = true;
        for (int i = 0; i < word.length(); i++) {
            wordInt = (int) word.charAt(i);
            if (!(word.length() < 20 && ((wordInt >= 65 && wordInt <= 90)
                    || (wordInt >= 97 && wordInt <= 122) || wordInt == '_'
                    || (wordInt >= 48 && wordInt <= 57)))) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }

    public static boolean registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!isCorrect(login)) throw new WrongLoginException("Неверный логин");
        if (!isCorrect(password) || !isCorrect(confirmPassword) || (confirmPassword != password)) throw new WrongPasswordException("Неверный пароль");
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;
        System.out.println("Введине логин");
        login = scanner.next();
        System.out.println("Введине пароль");
        password = scanner.next();
        System.out.println("Подтвердите пароль");
        confirmPassword = scanner.next();
        try{
            registration(login, password, confirmPassword);
        }
        catch (WrongLoginException loginException) {
            loginException.printStackTrace();
            System.out.println("Неверный логин");
        }
        catch (WrongPasswordException passwordException) {
            passwordException.printStackTrace();
            System.out.println("Неверный пароль");
        }
    }
}
