package com.example.lessons.lesson8.practise;

public class Doctor extends Worker{
    public Doctor(String name, int age, String specialization, int experience) {
        super(name, age, specialization, experience);
    }

    @Override
    public int getExperience() {
        return super.experience;
    }
}
