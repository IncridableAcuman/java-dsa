package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseISODateTime {
    public static void main(String[] args) {
        // 77. ISO formatdagi datetime'ni parse qiling:
        // 2026-09-06T14:35:20
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String format = formatter.format(localDateTime);
        System.out.println("Parsed: " + format);
    }
}
