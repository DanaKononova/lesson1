package com.example.lessons.lesson9_Exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
}
