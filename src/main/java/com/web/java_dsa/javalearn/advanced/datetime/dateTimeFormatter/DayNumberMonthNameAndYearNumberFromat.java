package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayNumberMonthNameAndYearNumberFromat {
    public static void main(String[] args) {
        // 68. Sanani:
        //
        //06 September 2026
        // ko‘rinishida chiqaring

        LocalDate date = LocalDate.now();
        System.out.println("Original: " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String format = formatter.format(date);
        System.out.println("Formated: " + format);
    }
}
