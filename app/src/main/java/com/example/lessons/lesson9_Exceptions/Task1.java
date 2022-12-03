package com.example.lessons.lesson9_Exceptions;

import java.util.Scanner;

public class Task1 {
    static final int WORD_LENGTH = 20;
    static final int LOWER_START_ENGL = 65;
    static final int LOWER_END_ENGL = 90;
    static final int UPPER_START_ENGL = 97;
    static final int UPPER_END_ENGL = 122;
    static final int ZERO_CODE = 48;
    static final int NINE_CODE = 57;

    public static boolean isPasswordLoginCorrect(String word) {
        boolean isCorrect = true;
        for (int i = 0; i < word.length(); i++) {
            int wordInt = (int) word.charAt(i);
            if (!(word.length() < WORD_LENGTH && ((wordInt >= LOWER_START_ENGL && wordInt <= LOWER_END_ENGL)
                    || (wordInt >= UPPER_START_ENGL && wordInt <= UPPER_END_ENGL) || wordInt == '_'
                    || (wordInt >= ZERO_CODE && wordInt <= NINE_CODE)))) {
                isCorrect = false;
            }
        }
        return !isCorrect;
    }

    public static void registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isPasswordLoginCorrect(login)) throw new WrongLoginException("Неверный логин");
        if (isPasswordLoginCorrect(password) || isPasswordLoginCorrect(confirmPassword) || (confirmPassword != password))
            throw new WrongPasswordException("Неверный пароль");
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
        try {
            registration(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException loginException) {
            loginException.printStackTrace();
            loginException.getMessage();
        }
    }
}
