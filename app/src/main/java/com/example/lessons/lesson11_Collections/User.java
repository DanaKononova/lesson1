package com.example.lessons.lesson11_Collections;

import java.util.ArrayDeque;

public class User {
    private ArrayDeque<String> messages = new ArrayDeque<>();
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void writeMessageToUsers(String message) {
        messages.offer(message);
    }

    public void readMessage() {
        while (messages.peek() != null) {
            System.out.println(messages.poll());
        }
    }
}
