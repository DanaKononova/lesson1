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
        boolean isCallAllowed = true;
        if (callNumber.startsWith("44")) {
            setBalance(getBalance() - 1);
            if (getBalance()<0) {
                isCallAllowed = false;
                setBalance(getBalance()+1);
            }
        } else {
            setBalance(getBalance() - 3);
            if (getBalance()<0) {
                isCallAllowed = false;
                setBalance(getBalance()+3);
            }
        }
        if(isCallAllowed) {
            System.out.println("Звоню на номер: "+callNumber);
        } else System.out.println("Звонок запрещён");
    }

    @Override
    public void recieveCall(String recieveNumber) {
        if (!recieveNumber.startsWith("44")) {
            setBalance(getBalance() - 1);
        }
        System.out.println("Принимаю звонок с номера  " + recieveNumber);
    }
}