package com.example.lessons.lesson14;

public class Task2 {
    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();

        Thread runnableThread1 = new Thread(runnableExample);
        runnableThread1.start();

        Thread runnableThread2 = new Thread(runnableExample);
        runnableThread2.start();

        Thread runnableThread3 = new Thread(runnableExample);
        runnableThread3.start();
    }
}
