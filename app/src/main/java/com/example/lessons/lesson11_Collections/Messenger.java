package com.example.lessons.lesson11_Collections;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Messenger {
    private static ArrayList<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static final int FIRST_ACTION = 1;
    private static final int SECOND_ACTION = 2;
    private static final int THIRD_ACTION = 3;
    private static final int FOURTH_ACTION = 4;
    private static final int FIFTH_ACTION = 5;

    public static int checkInputNumber() {
        int actionNumber = 0;
        String action;
        boolean isNumberOutOfBounds;
        do {
            action = scanner.nextLine();
            isNumberOutOfBounds = actionNumber <= 0 || actionNumber > 5;
            try {
                actionNumber = Integer.parseInt(action);
            } catch (NumberFormatException | InputMismatchException e) {
                e.printStackTrace();
            } finally {
                if (isNumberOutOfBounds) System.out.println("Некорректный ввод. Повторите попытку.");
            }
        } while (isNumberOutOfBounds);
        return actionNumber;
    }

    public static void addNewUser() {
        String name;
        User nameUser;
        System.out.println("Введите имя пользователя");
        do {
            name = scanner.nextLine();
            name = name.trim();
            nameUser = new User(name);
            if (name.isEmpty() || name.equals("")) {
                System.out.println("Введите ещё раз");
            } else {
                if(users.contains(nameUser)) {
                    System.out.println("Такой пользователь уже существует");
                } else {
                    users.add(nameUser);
                }
            }
        } while (users.contains(nameUser) || name.isEmpty() || name.equals(""));
    }

    public static void printUsers() {
        if (users.isEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public static void writeToUser() {
        if (users.isEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        String name, message;
        System.out.println("Выберите пользователя, которому хотите написать сообщение");
        name = scanner.nextLine();
        name = name.trim();
        User nameUser = new User(name);
        if (users.contains(nameUser)) {
            System.out.println("Введите сообщение, которое хотите написать");
            message = scanner.nextLine();
            users.get(users.indexOf(nameUser)).writeMessageToUsers(message);
        } else System.out.println("Нет такого пользователя");
    }

    public static void readUserMessages() {
        if (users.isEmpty()) {
            System.out.println("Пока нет пользователей");
            return;
        }
        String name;
        System.out.println("Выберите пользователя, сообщения которого хотите вывести");
        name = scanner.nextLine();
        User nameUser = new User(name);
        if(users.contains(nameUser)) {
            users.get(users.indexOf(nameUser)).readMessage();
        } else System.out.println("Нет такого пользователя");
    }

    public static void realization() {
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
                case FIRST_ACTION: {
                    addNewUser();
                    break;
                }
                case SECOND_ACTION: {
                    printUsers();
                    break;
                }
                case THIRD_ACTION: {
                    writeToUser();
                    break;
                }
                case FOURTH_ACTION: {
                    readUserMessages();
                    break;
                }
                case FIFTH_ACTION: {
                    System.out.println("Конец работы");
                    break;
                }
            }
        } while (actionNumber != FIFTH_ACTION);
    }

    public static void main(String[] args) {
        realization();
    }
}
