package com.example.lessons.oop7;

import java.util.Scanner;

public class Phone {
    private SimCard sim;
    private boolean isCardBlocked;
    private boolean isPhoneOn;
    Scanner scan = new Scanner(System.in);

    public Phone(SimCard sim) {
        this.sim = sim;
        this.isCardBlocked = false;
        this.isPhoneOn = false;
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
                +" Баланс новой симки: "+ newSim.getBalance());
        inputPinCode();
    }

    public void makeCall (String callNumber) {
        if (!isPhoneOn) {
            System.out.println("Телефон выключен. Включите его для совершения действий.");
            return;
        }
        if (isCardBlocked) {
            System.out.println("Карта заблокирована");
            return;
        }
        getSim().makeCall(callNumber);
    }

    public void recieveCall(String recieveCallNumber) {
        if (!isPhoneOn) {
            System.out.println("Телефон выключен. Включите его для совершения действий.");
            return;
        }
        if (isCardBlocked) {
            System.out.println("Карта заблокирована");
            return;
        }
        getSim().recieveCall(recieveCallNumber);
    }

    public void printBalance(){
        if (!isPhoneOn) {
            System.out.println("Телефон выключен. Включите его для совершения действий.");
            return;
        }
        if (isCardBlocked) {
            System.out.println("Карта заблокирована");
            return;
        }
        System.out.println("Баланс симки: "+getSim().getBalance());
    }

    public void printInfo() {
        if (!isPhoneOn) {
            System.out.println("Телефон выключен. Включите его для совершения действий.");
            return;
        }
        if (isCardBlocked) {
            System.out.println("Карта заблокирована");
            return;
        }
        System.out.println("Номер телефона: "+ getSim().getNumber()+"\nИмя оператора: "
                + getSim().getOperatorName() +" Баланс на карте: "+ getSim().getBalance());
    }

    public void inputPinCode() {
        System.out.println("Введите пин-код от карты");
        int appliedPinCode, triesNumber = 0;
        this.isCardBlocked = true;
        while (++triesNumber <= 3) {
            appliedPinCode = scan.nextInt();
            if (getSim().pinCodeCheck(appliedPinCode)) {
                this.isCardBlocked = false;
                System.out.println("Верно.");
                break;
            }
        }
        if (isCardBlocked) {
            System.out.println("Карта заблокирована");
        }
    }

    public boolean isPhoneOn() {
        return isPhoneOn;
    }

    public void phoneOff() {
        this.isPhoneOn = false;
        System.out.println("Телефон выключен");
        this.isCardBlocked = false;
    }

    public void phoneOn() {
        this.isPhoneOn = true;
        System.out.println("Телефон включен. Введите пинкод");
        inputPinCode();
    }
}