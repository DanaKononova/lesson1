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
        boolean isCallAllowed = true;
        if (callNumber.startsWith("29")) {
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
        boolean isCallAllowed = true;
        if (recieveNumber.startsWith("29")) {
            setBalance(getBalance());
            if (getBalance()<0) {
                isCallAllowed = false;
            }
        } else {
            setBalance(getBalance() - 1);
            if (getBalance()<0) {
                isCallAllowed = false;
                setBalance(getBalance()+1);
            }
        }
        if(isCallAllowed) {
            System.out.println("Принимаю звонок с номера  "+recieveNumber);
        } else System.out.println("Звонок запрещён");
    }
}
