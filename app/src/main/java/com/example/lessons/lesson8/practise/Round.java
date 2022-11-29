package com.example.lessons.lesson8.practise;

public class Round extends Figure{
    public Round(int side) {
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
        int square = (int) (Math.PI*getSide()*getSide());
        return square;
    }
}
