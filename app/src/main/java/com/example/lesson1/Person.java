package com.example.lesson1;

public class Person {
    String fullName;
    int age;

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(getFullName()+ " говорит");
    }

    public void talk() {
        System.out.println(getFullName()+ " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Кононова Дана", 19);
        person1.move();
        person2.talk();
    }
}