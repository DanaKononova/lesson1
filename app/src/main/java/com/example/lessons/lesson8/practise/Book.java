package com.example.lessons.lesson8.practise;

public class Book implements Printable{
    @Override
    public void print() {
        System.out.println("Книга напечатана");
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.print();
    }
}
