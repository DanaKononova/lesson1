package com.example.lessons.lesson8.practise;

public class Practise {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4);
        Round round = new Round(1);
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(triangle.getSquare()+"  "+round.getSquare()+"  "+rectangle.getSquare());
    }
}
