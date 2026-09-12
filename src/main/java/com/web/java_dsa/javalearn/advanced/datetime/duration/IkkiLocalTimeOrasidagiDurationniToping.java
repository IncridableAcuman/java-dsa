package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class IkkiLocalTimeOrasidagiDurationniToping {
    public static void main(String[] args) {
        // 81. Ikki LocalTime orasidagi Durationni toping.
        LocalTime first = LocalTime.of(9,12);
        LocalTime second = LocalTime.of(22,45);
        Duration duration = Duration.between(first,second);
        long hour = duration.toHours();
        long minutes = duration.toMinutes();
        System.out.println("Hours: " + hour + "\nMinutes: " + minutes);
    }
}
