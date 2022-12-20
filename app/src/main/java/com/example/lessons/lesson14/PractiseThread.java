package com.example.lessons.lesson14;

public class PractiseThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Runnable myRunnable = () -> {
            for (int i = 1; i < 100; i += 2) {
                System.out.println(i);
            }
        };
        Thread runnableThread = new Thread(myRunnable);

        myThread.start();
        runnableThread.start();
    }
}
