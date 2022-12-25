package com.example.lessons.lesson14.homework;

public class FastElevator implements Runnable {
    private final int MAX_CAPACITY = 10;
    private QueueToElevator queue;

    public FastElevator(QueueToElevator queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (queue.getPeoples() > 0) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.putPeople(this.MAX_CAPACITY, "Скоростной");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println("Скоростной лифт поднял " + queue.getPeoples() +" людей");
    }
}
