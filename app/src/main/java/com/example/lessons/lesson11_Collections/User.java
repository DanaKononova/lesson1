package com.example.lessons.lesson11_Collections;

import androidx.annotation.Nullable;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class User extends ArrayList {
    private ArrayDeque<String> messages = new ArrayDeque<>();
    private String name;

    @Override
    public boolean equals(@Nullable Object o) {
        o = (User) o;
        if (this.name.equals(((User) o).getName())) return true;
        return false;
    }

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
