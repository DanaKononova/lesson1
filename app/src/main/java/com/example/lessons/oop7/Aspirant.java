package com.example.lessons.oop7;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        setScienceWork(scienceWork);
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public int getSchoolarShip() {
        if (getAverageMark() == 5) return 200;
        else return 180;
    }
}
