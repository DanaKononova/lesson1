package com.example.lessons.lesson10_String;

public class DocumentTaskRealization {
    public static void twoBlockWithDigits(String document) {
        System.out.println("Первые два блока документа из 4 цифр");
        document = document.substring(0, 5) + document.substring(9, 13);
        System.out.println(document);
    }

    public static void documentNumberWithout3Letters(String document) {
        System.out.println("Замена блоков из 3 букв на ***");
        document = document.substring(0, 5)+"***-"+document.substring(9, 14)+"***-"+document.substring(18);
        System.out.println(document);
    }

    public static void lettersFromDocumentNumber(String document) {
        System.out.println("Только буквы документа в верхнем регисттре");
        document = document.toUpperCase();
        document = document.substring(5, 8)+"/"+document.substring(14,17)+"/"+document.substring(19, 20)+"/"+document.substring(21,22);
        System.out.println("Letters:"+document);
    }

    public static void abcCheckInDocumentNumber(String document) {
        System.out.println("Есть ли в номере документа 'abc'");
        if (document.contains("abc") || document.contains("ABC")) System.out.println("Номер документа содержит abc");
        else System.out.println("Номер документа не содержит abc");
    }

    public static void endCheckInDocumentNumber(String document) {
        System.out.println("Является ли последний блок документа - 1a2b");
        if (document.endsWith("1a2b") || document.endsWith("1A2B")) System.out.println("Документ заканчивается на 1a2b");
        else System.out.println("Документ не заканчивается на 1a2b");
    }
}
