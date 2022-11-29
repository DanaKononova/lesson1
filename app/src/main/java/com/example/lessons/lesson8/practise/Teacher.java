package com.example.lessons.lesson8.practise;

public class Teacher extends Worker{
    @Override
    public int getExperience() {
        return super.experience;
    }

    public Teacher(String name, int age, String specialization, int experience) {
        super(name, age, specialization, experience);
    }
}
