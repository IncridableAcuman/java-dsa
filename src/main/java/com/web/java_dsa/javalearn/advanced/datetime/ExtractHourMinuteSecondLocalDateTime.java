package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExtractHourMinuteSecondLocalDateTime {
    public static void main(String[] args) {
        // 18. Berilgan LocalDateTimening soat, minut va sekundini chiqaring.

        LocalDateTime localDateTime = LocalDateTime.now();


        LocalTime time = localDateTime.toLocalTime();
        int hour = time.getHour();
        int minute = time.getMinute();;
        int second = time.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
