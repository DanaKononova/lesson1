package com.example.lessons.lesson14.homework;

public class ComingCall {
    private int id;
    private String aim;

    public ComingCall(int id, String aim) {
        this.id = id;
        this.aim = aim;
    }

    public void operateCall(String workerName) {
        System.out.println("ID звонка: " + this.id + ", Цель звонка: " + this.aim + ", Обрабатывается работником: " + workerName);
    }
}
