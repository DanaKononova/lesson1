package com.example.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    String FIO;
    int ticketNumber;
    String facultet;
    String birthdate;
    String telephoneNumber;

    public Reader(String FIO, int ticketNumber, String facultet, String birthdate, String telephoneNumber) {
        this.FIO = FIO;
        this.ticketNumber = ticketNumber;
        this.facultet = facultet;
        this.birthdate = birthdate;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFacultet() {
        return facultet;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void takeBook(int bookAmount){
        System.out.println(getFIO()+ " взял " + bookAmount+ " книг");
    }

    public void takeBook(String ...bookNames){
        System.out.print(getFIO()+ " взял книги:");
        int index = 0;
        for(String name: bookNames) {
            index++;
            System.out.print(name);
            if(index != bookNames.length) {
                System.out.print(", ");
            }
        }
    }

    public void takeBook(Book ...books){
        System.out.print(getFIO()+ " взял книги:");
        int index = 0;
        for(Book name: books) {
            index++;
            System.out.print(name.getBookName());
            if(index != books.length) {
                System.out.print(", ");
            }
        }
    }

    public void returnBook(int bookAmount){
        System.out.println(getFIO()+ " вернул " + bookAmount+ " книг");
    }

    public void returnBook(String ...bookNames){
        System.out.print(getFIO()+ " вернул книги:");
        int index = 0;
        for(String name: bookNames) {
            index++;
            System.out.print(name);
            if(index != bookNames.length) {
                System.out.print(", ");
            }
        }
    }

    public void returnBook(Book ...books){
        System.out.print(getFIO()+ " вернул книги:");
        int index = 0;
        for(Book name: books) {
            index++;
            System.out.print(name.getBookName());
            if(index != books.length) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Reader[] readers;
        System.out.println("Введите количество читателей");
        int readersNumber = scan.nextInt();
        readers = new Reader[readersNumber];
        System.out.println("Заполните читателей");
        String FIO;
        int ticketNumber;
        String facultet;
        String birthdate;
        String telephoneNumber;
        for (int i = 0; i < readersNumber; i++) {
            System.out.println("Введите ФИО читателя");
            FIO = scan.next();
            System.out.println("Введите номер читательского билета");
            ticketNumber = scan.nextInt();
            System.out.println("Введите факультет");
            facultet = scan.next();
            System.out.println("Введите дату рождения");
            birthdate = scan.next();
            System.out.println("Введите телефон");
            telephoneNumber = scan.next();
            readers[i] = new Reader(FIO,ticketNumber,facultet,birthdate,telephoneNumber);
        }
        System.out.println(Arrays.toString(readers));
        System.out.println("Введите номер читателя о котором хотите узнать");
        int number = scan.nextInt();
        readers[number].takeBook(3);
        readers[number].takeBook("Физика", "Математика", " Актиос");
        readers[number].takeBook(new Book("павел", "Физика"), new Book("игорь", "Математика"));
        readers[number].returnBook(3);
        readers[number].returnBook("Физика", "Математика", " Актиос");
        readers[number].returnBook(new Book("павел", "Физика"), new Book("игорь", "Математика"));

    }
}