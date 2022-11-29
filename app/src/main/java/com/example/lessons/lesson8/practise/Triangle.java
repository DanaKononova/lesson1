package com.example.lessons.lesson8.practise;

public class Triangle extends Figure{
    public Triangle(int side) {
        super(side);
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
        int square = (int) (getSide()*getSide()*Math.sqrt(3)/4);
        return square;
    }
}
