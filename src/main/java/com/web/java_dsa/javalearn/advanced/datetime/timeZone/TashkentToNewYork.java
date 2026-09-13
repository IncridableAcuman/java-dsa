package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TashkentToNewYork {
    public static void main(String[] args) {
        // 95. Tashkentdagi 15:00 vaqtni New York vaqtiga aylantiring.
        ZoneId tashkentZoneId = ZoneId.of("Asia/Tashkent");
        ZonedDateTime tashkent = ZonedDateTime.of(2026,9,13,15,0,0,0,tashkentZoneId);
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        ZonedDateTime newYork = tashkent.withZoneSameInstant(newYorkZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ZZZZ");
        String format = newYork.format(formatter);
        System.out.println(format);
    }
}
