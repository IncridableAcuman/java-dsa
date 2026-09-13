package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EuropeLondon {
    public static void main(String[] args) {
        // 93. Europe/London timezone bilan hozirgi vaqtni oling.
        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ZZZZ");
        String format = dateTime.format(formatter);
        System.out.println("London: " + format);
    }
}
