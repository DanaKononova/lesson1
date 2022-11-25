package com.example.lessons.oop7;

public final class A1SimCard extends SimCard {

    protected A1SimCard(String number, int balance) {
        super("33" + number, balance);
    }

    @Override
    public String getOperatorName() {
        return "A1";
    }

    @Override
    public void makeCall(String callNumber) {
        if (callNumber.startsWith("33")) {
            if (getBalance() < 1) {
                System.out.println("Звонок запрещён");
            } else {
                System.out.println("Звоню на номер: " + callNumber);
                setBalance(getBalance() - 1);
            }
        } else {
            if (getBalance() < 3) {
                System.out.println("Звонок запрещён");
            } else {
                System.out.println("Звоню на номер: " + callNumber);
                setBalance(getBalance() - 3);
            }
        }
    }

    @Override
    public void recieveCall(String recieveNumber) {
        if (!recieveNumber.startsWith("33")) {
            setBalance(getBalance() - 1);
        }
        System.out.println("Принимаю звонок с номера  " + recieveNumber);
    }
}
