package com.example.lessons.lesson11_Collections;

public class Student {
    private String name;
    private String group;
    private int course;
    private int averageMark;

    public Student(String name, String group, int averageMark, int course) {
        this.name = name;
        this.group = group;
        this.averageMark = averageMark;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public int getCourse() {
        return this.course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
}
