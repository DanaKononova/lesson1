package com.example.lessons.lesson14;

public class PotokTask {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        RunnableThread runnableThreadLocal = new RunnableThread();
        Thread runnableThread = new Thread(runnableThreadLocal);

        Runnable myRunnable = () -> {
            for (int i = 21; i <= 30; i++) {
                System.out.println(i);
            }
        };
        Thread lambdaThread = new Thread(myRunnable);

        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runnableThread.start();
        try {
            runnableThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lambdaThread.start();
    }
    
}
