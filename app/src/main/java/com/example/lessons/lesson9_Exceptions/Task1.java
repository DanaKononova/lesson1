package com.example.lessons.lesson9_Exceptions;

import java.util.Scanner;

public class Task1 {
    private static final int WORD_LENGTH = 20;
    private static final int LOWER_START_LATIN = 65;
    private static final int LOWER_END_LATIN = 90;
    private static final int UPPER_START_LATIN = 97;
    private static final int UPPER_END_LATIN = 122;
    private static final int NUMBER_ZERO_CODE = 48;
    private static final int NUMBER_NINE_CODE = 57;

    public static boolean isPasswordLoginCorrect(String word) {
        boolean isCorrect = true;
        for (int i = 0; i < word.length(); i++) {
            int wordInt = (int) word.charAt(i);
            if (!(word.length() < WORD_LENGTH && ((wordInt >= LOWER_START_LATIN && wordInt <= LOWER_END_LATIN)
                    || (wordInt >= UPPER_START_LATIN && wordInt <= UPPER_END_LATIN) || wordInt == '_'
                    || (wordInt >= NUMBER_ZERO_CODE && wordInt <= NUMBER_NINE_CODE)))) {
                isCorrect = false;
            }
        }
        return !isCorrect;
    }

    public static void checkLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isPasswordLoginCorrect(login)) throw new WrongLoginException("Неверный логин");
        if (isPasswordLoginCorrect(password) || isPasswordLoginCorrect(confirmPassword) || (confirmPassword != password))
            throw new WrongPasswordException("Неверный пароль");
    }

    public static void registration() {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword;
        System.out.println("Введине логин");
        login = scanner.next();
        System.out.println("Введине пароль");
        password = scanner.next();
        System.out.println("Подтвердите пароль");
        confirmPassword = scanner.next();
        try {
            checkLoginPassword(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException loginException) {
            loginException.printStackTrace();
            loginException.getMessage();
        }
    }

    public static void main(String[] args) {
        registration();
    }
}
