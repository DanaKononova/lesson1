package com.example.lessons.lesson8.practise;

public class Pilot extends Worker{
    public Pilot(String name, int age, String specialization, int experience) {
        super(name, age, specialization, experience);
    }

    @Override
    public int getExperience() {
        return experience;
    }

}
