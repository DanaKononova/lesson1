package com.example.lessons.lesson8.practise;

abstract public class Worker extends Person{
    private String specialization;
    public int experience;

    public Worker(String name, int age, String specialization, int experience) {
        super(name, age);
        setSpecialization(specialization);
        this.experience = experience;
    }

    public abstract int getExperience();

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
