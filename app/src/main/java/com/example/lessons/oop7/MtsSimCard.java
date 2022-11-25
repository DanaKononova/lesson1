package com.example.lessons.oop7;

public final class MtsSimCard extends SimCard{

    protected MtsSimCard(String number, int balance) {
        super("29"+number, balance);
    }

    @Override
    public String getOperatorName() {
        return "MTS";
    }

    @Override
    public void makeCall(String callNumber) {
        int callSum = callNumber.startsWith("29") ? 1 : 3;
        if (getBalance() < callSum) {
            System.out.println("Звонок запрещён");
        } else {
            System.out.println("Звоню на номер: " + callNumber);
            setBalance(getBalance() - callSum);
        }
    }

    @Override
    public void recieveCall(String recieveNumber) {
        if (!recieveNumber.startsWith("29")) {
            setBalance(getBalance() - 1);
        }
        System.out.println("Принимаю звонок с номера  " + recieveNumber);
    }
}
