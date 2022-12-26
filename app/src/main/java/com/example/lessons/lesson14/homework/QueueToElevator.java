package com.example.lessons.lesson14.homework;

public class QueueToElevator {
    private int peoples;

    public QueueToElevator(int peoples) {
        this.peoples = peoples;
    }

    public int getPeoples() {
        return peoples;
    }

    public synchronized void putPeople(int maxPeople, String elevator) {
        if (peoples != 0) {
            if (peoples > maxPeople) {
                this.peoples -= maxPeople;
                System.out.println(elevator + " лифт поднял " + maxPeople);
            } else {
                System.out.println(elevator + " лифт поднял " + this.peoples);
                this.peoples = 0;
            }
        }
    }
}
