package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormat {
    public static void main(String[] args) {
        // 66. LocalDateni quyidagi formatga o‘tkazing:
        // 06/09/2026
        LocalDate original = LocalDate.now();
        System.out.println("Original: " + original);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = formatter.format(original);
        System.out.println("Formated: " + format);
    }
}
