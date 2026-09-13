package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OnlineMeeting {
    public static void main(String[] args) {
        // 98. Online meeting Tashkent vaqti bilan 18:00da boshlanadi. New Yorkdagi vaqtini toping.
        ZoneId tashkentZoneId = ZoneId.of("Asia/Tashkent");
        ZonedDateTime tashkent = ZonedDateTime.of(2026,9,13,18,0,0,0,tashkentZoneId);

        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        ZonedDateTime newYork = tashkent.withZoneSameInstant(newYorkZoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ZZZZ");
        String format = newYork.format(formatter);
        System.out.println("For New York: " + format);
    }
}
