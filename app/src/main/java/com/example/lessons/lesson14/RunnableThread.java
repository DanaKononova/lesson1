package com.example.lessons.lesson14;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
