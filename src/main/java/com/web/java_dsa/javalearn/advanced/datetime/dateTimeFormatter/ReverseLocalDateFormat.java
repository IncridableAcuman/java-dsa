package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReverseLocalDateFormat {
    public static void main(String[] args) {
        // 67. Sanani:
        //
        //06-09-2026
        //
        //formatida chiqaring.

        LocalDate date = LocalDate.now();
        System.out.println("Original: " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format = formatter.format(date);
        System.out.println("Formated: " + format);
    }
}
