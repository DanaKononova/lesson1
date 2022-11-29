package com.example.lessons.lesson8.practise;

abstract public class Figure implements Squarable{
    private int side;

    public Figure(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
