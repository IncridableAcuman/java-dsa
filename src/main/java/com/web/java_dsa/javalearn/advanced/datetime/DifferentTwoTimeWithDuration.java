package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class DifferentTwoTimeWithDuration {
    public static void main(String[] args) {
        // 19. Ikki event orasidagi vaqt farqini Duration yordamida toping.

        LocalTime time = LocalTime.now().plusHours(2).plusMinutes(20);
        LocalTime time1 = LocalTime.now();

        Duration duration = Duration.between(time1,time);

        int hour = duration.toHoursPart();
        System.out.println("Hour: " + hour);
        int minute = duration.toMinutesPart();
        System.out.println("Minute: " + minute);
    }
}
