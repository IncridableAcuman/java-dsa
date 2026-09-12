package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class IkkiLocalDateTimeOrasidagiDurationniToping {
    public static void main(String[] args) {
        // 82. Ikki LocalDateTime orasidagi Durationni toping.
        LocalDateTime first = LocalDateTime.now();
        LocalDateTime second = LocalDateTime.now().plusMinutes(12);
        Duration duration = Duration.between(first,second);
        System.out.println("Duration: " + duration.toMinutes());
    }
}
