package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserTimeZone {
    public static void main(String[] args) {
        // 97. User timezone'ini berib, uning local vaqtini ko‘rsating.
        //
        //Asia/Tashkent
        //Europe/Berlin
        //America/New_York
        //Asia/Tokyo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zone id (example Asia/Tashkent): ");
        String id = scanner.next();
        ZoneId userZoneId = ZoneId.of(id);
        ZonedDateTime dateTime = ZonedDateTime.now(userZoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss ZZZZ");
        String format = dateTime.format(formatter);
        System.out.println(format);
    }
}
