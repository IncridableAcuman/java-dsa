package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converting {
    public static void main(String[] args) {
        // 20. Berilgan String:
        //
        //2026-09-05 14:30:00
        //
        //ni LocalDateTimega aylantiring.

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = formatter.format(localDateTime);
        System.out.println(format);
    }
}
