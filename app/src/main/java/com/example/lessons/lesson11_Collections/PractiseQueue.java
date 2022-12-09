package com.example.lessons.lesson11_Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PractiseQueue {
    public static void printQueue(PriorityQueue<Person> priorityQueue) {
        PriorityQueue<Person> buffQueue = new PriorityQueue<Person>();
        buffQueue.addAll(priorityQueue);
        while (buffQueue.peek() != null) {
            System.out.println(buffQueue.poll().getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>();
        priorityQueue.add(new Person("person one"));
        priorityQueue.add(new Person("person two"));
        priorityQueue.add(new Person("person three"));
        priorityQueue.add(new Person("person four"));
        priorityQueue.add(new Person("person fife"));
        printQueue(priorityQueue);
        System.out.println(priorityQueue.size());
        boolean isStop = false;
        do {
            System.out.println("Введите 1, чтобы дополнить очередь");
            System.out.println("Введите 2, чтобы посадить людей из очереди в маршрутку");
            System.out.println("Введите 3, чтобы остановить");
            int k = scanner.nextInt();
            switch (k) {
                case 1: {
                    priorityQueue.add(new Person("person " + (priorityQueue.size() + 1)));
                    printQueue(priorityQueue);
                    break;
                }
                case 2: {
                    System.out.println("Введите количество людей");
                    int peoples = scanner.nextInt();
                    if (priorityQueue.size() < peoples)
                        System.out.println("Недостаточно людей в очереди");
                    else {
                        int i = 0;
                        while (i < peoples) {
                            priorityQueue.poll();
                            i++;
                        }
                    }
                    printQueue(priorityQueue);
                    break;
                }
                case 3: {
                    isStop = true;
                    break;
                }
            }
        } while(!isStop);
    }
}
