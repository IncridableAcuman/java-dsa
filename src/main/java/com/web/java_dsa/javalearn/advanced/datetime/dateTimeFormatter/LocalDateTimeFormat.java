package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormat {
    public static void main(String[] args) {
        // 69. LocalDateTimeni:
        //
        //06.09.2026 14:35:20
        //
        //formatiga o‘tkazing.

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Original: " + localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        String format = formatter.format(localDateTime);
        System.out.println("Formated: " + format);
    }
}
