package com.example.lessons.lesson8.practise;

public class Rectangle extends Triangle{
    private int anotherSide;

    public int getAnotherSide() {
        return anotherSide;
    }

    public void setAnotherSide(int anotherSide) {
        this.anotherSide = anotherSide;
    }

    public Rectangle(int side, int anotherSide) {
        super(side);
        this.anotherSide = anotherSide;
    }

    @Override
    public int getSide() {
        return super.getSide();
    }

    @Override
    public void setSide(int side) {
        super.setSide(side);
    }

    @Override
    public int getSquare() {
        return getSide()*getAnotherSide();
    }
}
