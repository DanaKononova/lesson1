package com.example.lessons.lesson14;

public class Task3 {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        Runnable myRunnable = () -> {
            while (counter.getValue() <= 30) {
                synchronized (counter) {
                    System.out.println(counter.getValue());
                    counter.setValue(counter.getValue() + 1);
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread runnableThread1 = new Thread(myRunnable);
        Thread runnableThread2 = new Thread(myRunnable);
        Thread runnableThread3 = new Thread(myRunnable);

        runnableThread1.start();
        runnableThread2.start();
        runnableThread3.start();
    }
}
