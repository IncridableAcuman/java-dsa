package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringParseToLocalDateTime2 {
    public static void main(String[] args) {
        // 72. Quyidagi Stringni parse qiling:
        //
        //06/09/2026 14:35

        String format = "06/09/2026 14:35";
        String[] str = format.split(" ");
        LocalDate date = LocalDate.parse(str[0],DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Parsed date: " + date);
        LocalTime time = LocalTime.parse(str[1],DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Parsed time: " + time);
        LocalDateTime parsedLocalDateTime = LocalDateTime.of(date,time);
        System.out.println("Parsed date and time to LocalDateTime: " + parsedLocalDateTime);

    }
}
