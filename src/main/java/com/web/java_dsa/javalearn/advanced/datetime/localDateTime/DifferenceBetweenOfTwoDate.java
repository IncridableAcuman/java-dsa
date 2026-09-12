package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DifferenceBetweenOfTwoDate {
    public static void main(String[] args) {
        // 64. Ikki datetime orasidagi jami minutlarni toping.
        LocalDateTime first = LocalDateTime.of(2026,9,10,22,10);
        LocalDateTime second = LocalDateTime.now();
        Duration duration = Duration.between(first,second);
        long minutes = duration.toMinutes();
        System.out.println("Minutes: " + minutes);
    }
}
