package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TashkentMeetingToTokyo {
    public static void main(String[] args) {
        // 96. Tashkentdagi meeting vaqtini Tokyo vaqtiga o'tkazing.
        ZoneId tashkentZoneId = ZoneId.of("Asia/Tashkent");
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tashkent = ZonedDateTime.now(tashkentZoneId);
        ZonedDateTime tokyo = tashkent.withZoneSameInstant(tokyoZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss ZZZZ");
        String format = tokyo.format(formatter);
        System.out.println("Tokyo: " + format);
    }
}
