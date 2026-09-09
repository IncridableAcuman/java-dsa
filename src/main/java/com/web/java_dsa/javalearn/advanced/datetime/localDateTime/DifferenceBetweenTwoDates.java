package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DifferenceBetweenTwoDates {
    public static void main(String[] args) {
        // 52. Ikki LocalDateTime orasidagi vaqt farqini toping.
        LocalDateTime first = LocalDateTime.now().plusDays(2).plusMonths(3).plusDays(3);
        LocalDateTime second = LocalDateTime.now();

        Duration duration = Duration.between(second,first);

        long days = duration.toDays();
        System.out.println("Days: " + days);
        long hours = duration.toHours() % 24;
        System.out.println("Days: " + hours);
    }
}
