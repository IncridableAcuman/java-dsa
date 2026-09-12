package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ParseDate {
    public static void main(String[] args) {
        // 78. User quyidagicha sana kiritsin:
        //
        //2026/09/06
        //
        //Uni parse qiling.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("yyyy/MM/dd: ");
            String date = scanner.next();
            LocalDate parsed = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            System.out.println("Parsed: " + parsed);
        } catch (DateTimeParseException exception){
            System.out.println(exception.getMessage());
        }
    }
}
