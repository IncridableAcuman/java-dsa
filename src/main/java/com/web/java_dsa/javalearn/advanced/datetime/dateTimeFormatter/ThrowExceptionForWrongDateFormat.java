package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ThrowExceptionForWrongDateFormat {
    public static void main(String[] args) {
        // 73. Noto‘g‘ri sana kiritilganda exceptionni handle qiling.
        //
        //Masalan:
        //
        //31/02/2026

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Only yyyy-MM-dd format: ");
            String format = scanner.next();
            LocalDate date = LocalDate.parse(format);
            System.out.println("Parsed: " + date);
        } catch (DateTimeParseException exception){
            System.out.println(exception.getMessage());
        }
    }
}
