package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class AsiaTashkentTimeZone {
    public static void main(String[] args) {
        // 92. Asia/Tashkent timezone bilan hozirgi vaqtni oling.

        ZoneId zoneId = ZoneId.of("Asia/Tashkent");

        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);

        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss ZZZZ");
        String format = dateTime.format(formatter);
        System.out.println("Tashkent: " + format);
    }
}
