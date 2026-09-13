package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeZone {
    public static void main(String[] args) {
        // 91. Tizimdagi mavjud timezone'larni chiqaring.
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);

        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ZZZZ");
        String format = dateTime.format(formatter);
        System.out.println(format);
    }
}
