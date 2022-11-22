package com.example.lesson1;

public class Book {
    String authorName;
    String bookName;

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }
}