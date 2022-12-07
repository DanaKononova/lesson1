package com.example.lessons.lesson10_String;

import java.util.Scanner;

public class DocumentNumber {
    private static final String DOCUMENT_REGEXP = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static boolean checkDocumentFormat(String document) {
        if (document.matches(DOCUMENT_REGEXP)) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean isDocumentFormatCorrect = false;
        String document;
        do {
            System.out.println("Введите номер документа");
            Scanner scanner = new Scanner(System.in);
            document = scanner.next();
            isDocumentFormatCorrect = checkDocumentFormat(document);
            if (!isDocumentFormatCorrect) System.out.println("Формат документа неверный. Введите ещё раз");
        } while (!isDocumentFormatCorrect);

        DocumentTaskRealization.twoBlockWithDigits(document);
        DocumentTaskRealization.documentNumberWithout3Letters(document);
        DocumentTaskRealization.lettersFromDocumentNumber(document);
        DocumentTaskRealization.abcCheckInDocumentNumber(document);
        DocumentTaskRealization.endCheckInDocumentNumber(document);
    }
}
