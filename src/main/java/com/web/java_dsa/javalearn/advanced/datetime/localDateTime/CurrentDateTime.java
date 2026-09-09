package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        // 46. Hozirgi sana va vaqtni LocalDateTime orqali oling.
        LocalDateTime current = LocalDateTime.now();
        LocalDate date = current.toLocalDate();
        LocalTime time = current.toLocalTime();
        System.out.println("Current date: " + date + "\nCurrent time: " + time);
    }
}
