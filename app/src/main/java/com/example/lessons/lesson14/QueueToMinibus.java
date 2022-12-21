package com.example.lessons.lesson14;

import java.util.ArrayDeque;

public class QueueToMinibus {
    private ArrayDeque<String> queue = new ArrayDeque();

    public QueueToMinibus() {
    }

    public ArrayDeque<String> getQueue() {
        return queue;
    }

    public synchronized void get(int peoples) {
        while (queue.size()<peoples) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        for(int i = 1; i <= peoples; i++) {
            queue.poll();
        }
        System.out.println("В очереди осталось "+ queue.size());
        notify();
    }

    public synchronized void put(int peoples) {
        while (queue.size()> 10) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        for(int i = 1; i <= peoples; i++) {
            queue.add("person " + i);
        }
        System.out.println("В очередь столько пришло "+ peoples);
        System.out.println("В очереди стало "+ queue.size());
        notify();
    }
}
