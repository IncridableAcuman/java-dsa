package com.web.java_dsa.javalearn.advanced.datetime.timeZone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FiveCountryCurrentTime {
    public static void main(String[] args) {
        // 99. Dunyoning 5 ta timezone'ida hozirgi vaqtni chiqaring.
        ZoneId samarkandZoneIs = ZoneId.of("Asia/Samarkhand");
        ZonedDateTime samarkand = ZonedDateTime.now(samarkandZoneIs);
        System.out.println("Samarkand: " + samarkand);
        ZoneId tashkentZoneId = ZoneId.of("Asia/Tashkent");
        ZonedDateTime tashkent = ZonedDateTime.now(tashkentZoneId);
        System.out.println("Tashkent: " + tashkent);
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyo = ZonedDateTime.now(tokyoZoneId);
        System.out.println("Tokyo: " + tashkent);
    }
}
