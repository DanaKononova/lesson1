package com.example.lessons.oop7;

public final class LifeSimCard extends SimCard {

    protected LifeSimCard(String number, int balance) {
        super("44"+number, balance);
    }

    @Override
    public String getOperatorName() {
        return "Life";
    }

    @Override
    public void makeCall(String callNumber) {
        int callSum = callNumber.startsWith("44") ? 1 : 3;
        if (getBalance() < callSum) {
            System.out.println("Звонок запрещён");
        } else {
            System.out.println("Звоню на номер: " + callNumber);
            setBalance(getBalance() - callSum);
        }
    }

    @Override
    public void recieveCall(String recieveNumber) {
        if (!recieveNumber.startsWith("44")) {
            setBalance(getBalance() - 1);
        }
        System.out.println("Принимаю звонок с номера  " + recieveNumber);
    }
}
