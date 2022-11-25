package com.example.lessons.oop7;

public class Phone {
    private SimCard sim;

    public Phone(SimCard sim) {
        this.sim = sim;
    }

    public SimCard getSim() {
        return sim;
    }

    public void setSim(SimCard sim) {
        this.sim = sim;
    }

    public void insertNewSim (SimCard newSim) {
        setSim(newSim);
        System.out.println("Номер новой карты: "+ newSim.getNumber()+"\nИмя оператора карты: " + newSim.getOperatorName()
        +"Баланс новой симки: "+ newSim.getBalance());
    }

    public void makeCall (String callNumber) {
        getSim().makeCall(callNumber);
    }

    public void recieveCall(String recieveCallNumber) {
        getSim().recieveCall(recieveCallNumber);
    }

    public void printBalance(){
        System.out.println("Баланс симки: "+getSim().getBalance());
    }
}
