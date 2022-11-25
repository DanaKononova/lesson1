package com.example.lessons.oop7;

public class SimCard {
    private String number;
    private int balance;
    private int pinCode;

    protected SimCard(String number, int balance, int pinCode) {
        this.balance = balance;
        this.number = number;
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOperatorName() {
        return "";
    }

    public void makeCall(String callNumber) {
        if(getBalance() >= 0) {
            System.out.println("Звоню на номер: "+callNumber);
        } else System.out.println("Звонок запрещён");
    }

    public void recieveCall(String recieveNumber) {
        if(getBalance() >= 0) {
            System.out.println("Принимаю звонок с номера "+recieveNumber);
        } else System.out.println("Звонок запрещён");
    }

    public boolean pinCodeCheck(int appliedPinCode) {
        return appliedPinCode == this.pinCode;
    }
}