package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringParseToLocalDateTime {
    public static void main(String[] args) {
        // 71. Quyidagi Stringni LocalDateTimega parse qiling:
        //
        //2026-09-06 14:35:20
        /*try {
            String format = "2026-09-06 14:35:20";
            String[] str = format.split(" ");
            LocalDate date = LocalDate.parse(str[0]);
            LocalTime time = LocalTime.parse(str[1]);
            LocalDateTime parsed = LocalDateTime.of(date,time);
            System.out.println("Parsed: " + parsed);
        } catch (DateTimeParseException e){
            System.out.println(e.getMessage());
        }*/
        String format = "2026-09-06 14:35:20";
        LocalDateTime parsed = LocalDateTime.parse(format, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Parsed: " + parsed);
    }
}
