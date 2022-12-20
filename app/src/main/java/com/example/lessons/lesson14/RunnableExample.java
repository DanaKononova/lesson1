package com.example.lessons.lesson14;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
