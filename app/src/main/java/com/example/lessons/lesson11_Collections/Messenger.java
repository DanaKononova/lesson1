package com.example.lessons.lesson11_Collections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Messenger {
    private static ArrayList<User> users = new ArrayList<User>();
    static Scanner scanner = new Scanner(System.in);

    public static int checkInputNumber() {
        int actionNumber = 0;
        boolean isInputCorrect = false;
        String action;
        do {
            action = scanner.nextLine();
            try {
                actionNumber = Integer.parseInt(action);
                if (actionNumber > 0 && actionNumber <= 5) {
                    isInputCorrect = true;
                }
            } catch (NumberFormatException | InputMismatchException e) {
            } finally {
                if (!isInputCorrect) System.out.println("Некорректный ввод. Повторите попытку.");
            }
        } while (!isInputCorrect);
        return actionNumber;
    }

    public static boolean isUsersEmpty() {
        return users.isEmpty();
    }

    public static void addNewUser() {
        String name;
        boolean isNameCorrect;
        System.out.println("Введите имя пользователя");
        do {
            isNameCorrect = true;
            name = scanner.nextLine();
            name.trim();
            if (name == "") {
                System.out.println("Введите ещё раз");
                isNameCorrect = false;
            } else {
                for (User user : users) {
                    if (user.getName().equals(name)) {
                        System.out.println("Такой пользователь уже существует");
                        isNameCorrect = false;
                        break;
                    }
                }
            }
            if (isNameCorrect) users.add(new User(name));
        } while (!isNameCorrect);
    }

    public static void printUsers() {
        if (isUsersEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public static void writeToUser() {
        if (isUsersEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        boolean isUserFound;
        String name, message;
        System.out.println("Выберите пользователя, которому хотите написать сообщение");
        name = scanner.nextLine();
        isUserFound = false;
        for (User user : users) {
            if (user.getName().equals(name)) {
                System.out.println("Введите сообщение, которое хотите написать");
                message = scanner.nextLine();
                user.writeMessageToUsers(message);
                isUserFound = true;
                break;
            }
        }
        if (!isUserFound) System.out.println("Нет такого пользователя");
    }

    public static void readUserMessages() {
        if (isUsersEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        boolean isUserFound;
        String name;
        System.out.println("Выберите пользователя, сообщения которого хотите вывести");
        name = scanner.nextLine();
        isUserFound = false;
        for (User user : users) {
            if (user.getName().equals(name)) {
                user.readMessage();
                isUserFound = true;
                break;
            }
        }
        if (!isUserFound) System.out.println("Нет такого пользователя");
    }

    public static void mainInterface() {
        System.out.println("Мессенджер для начинающих");
        int actionNumber;
        do {
            System.out.println("Введите 1, чтобы добавить нового пользователя");
            System.out.println("Введите 2, чтобы вывести список пользователей");
            System.out.println("Введите 3, чтобы написать сообщение пользователю");
            System.out.println("Введите 4, чтобы просмотреть сообщения пользователя");
            System.out.println("Введите 5, чтобы закончить работу");
            actionNumber = checkInputNumber();
            switch (actionNumber) {
                case 1: {
                    addNewUser();
                    break;
                }
                case 2: {
                    printUsers();
                    break;
                }
                case 3: {
                    writeToUser();
                    break;
                }
                case 4: {
                    readUserMessages();
                    break;
                }
                case 5: {
                    System.out.println("Конец работы");
                    break;
                }
            }
        } while (actionNumber != 5);
    }

    public static void main(String[] args) {
        mainInterface();
    }
}
