package com.example.lessons.lesson14.homework;

import java.util.ArrayList;
import java.util.List;

public class CallCentre {

    public static void main(String[] args) {
        List<ComingCall> comingCalls = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            comingCalls.add(new ComingCall(i, "call " + i));
        }

        Runnable myRunnable = () -> {
            for (int i = 0; i < 8; i++) {
                while (!comingCalls.isEmpty()) {
                    synchronized (comingCalls) {
                        if (!comingCalls.isEmpty()) {
                            comingCalls.get(i).operateCall(Thread.currentThread().getName());
                            try {
                                Thread.sleep(800);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            comingCalls.remove(i);
                        }
                    }
                }
            }
        };

        Thread firstThread = new Thread(myRunnable);
        firstThread.setName("First worker");

        Thread secondThread = new Thread(myRunnable);
        secondThread.setName("Second Worker");

        Thread thirdThread = new Thread(myRunnable);
        thirdThread.setName("Third Worker");

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
