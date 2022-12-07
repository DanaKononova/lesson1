package com.example.lessons.lesson11_Collections;

import java.util.ArrayList;

public class Practise {
    public static void checkCourse(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageMark() >= 3) {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course)
                System.out.println(students.get(i).getName());
        }
    }

    public static void printIfAverageMarkGreater3AndDelete(ArrayList<Student> students) {
        System.out.println("Студенты с баллом выше трёх:");
        int i = 0;
        while ( i < students.size()) {
            if (students.get(i).getAverageMark() < 3) {
                students.remove(i);
            } else {
                System.out.println(students.get(i).getName());
                i++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Dana", "151001", 8, 2));
        students.add(new Student("Andrey", "151001", 8, 2));
        students.add(new Student("Dasha", "151002", 8, 2));
        students.add(new Student("Nikita", "151001", 2, 2));
        students.add(new Student("Dima", "151003", 1, 2));
        checkCourse(students);
        printStudents(students, 3);
        printIfAverageMarkGreater3AndDelete(students);
    }
}
