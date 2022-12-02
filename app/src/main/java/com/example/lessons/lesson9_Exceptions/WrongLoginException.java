package com.example.lessons.lesson9_Exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }
}
