package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreatingLocalDateTime {
    public static void main(String[] args) {
        // 47. Berilgan sana va vaqtdan LocalDateTime yarating.
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(date,time);
        System.out.println("Created local date time: " + localDateTime);
    }
}
