package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ParsetoLocalDateFormat {
    public static void main(String[] args) {
        // 74. Foydalanuvchi sanani:
        //
        //dd.MM.yyyy
        //
        //formatida kiritsin.
        // Uni LocalDatega aylantiring.

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("dd.MM.yyyy format: ");
            String format = scanner.next();
            LocalDate date = LocalDate.parse(format, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            System.out.println("Parsed: " + date);
        } catch (DateTimeParseException exception){
            System.out.println(exception.getMessage());
        }
    }
}
