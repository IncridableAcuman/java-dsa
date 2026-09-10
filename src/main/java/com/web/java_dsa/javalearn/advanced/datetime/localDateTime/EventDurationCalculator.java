package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class EventDurationCalculator {
    public static void main(String[] args) {
        // 53. Event boshlanishi va tugash vaqtini berib, event davomiyligini hisoblang.
        LocalDateTime firstEvent = LocalDateTime.of(2026,9,10,12,30);
        LocalDateTime secondEvent = LocalDateTime.of(2026,9,22,9,25);

        Duration duration = Duration.between(firstEvent,secondEvent);
        long days = duration.toDays();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();

        System.out.println("Start: " + firstEvent);
        System.out.println("End: " + secondEvent);
        System.out.println("-------------------");
        System.out.println("Days: " + days + ", Hours: " + hours + ", Minutes: " + minutes);
    }
}
