package com.web.java_dsa.javalearn.advanced.datetime.instant;

import java.time.Duration;
import java.time.Instant;

public class DifferenceBetweenTwoInstant {
    public static void main(String[] args) {
        // 109. Ikki Instant orasidagi millisekundlarni hisoblang.
        Instant first = Instant.now();
        Instant second = Instant.now().plusSeconds(12);
        Duration duration = Duration.between(first,second);
        long seconds = duration.getSeconds();
        System.out.println("Seconds: " + seconds);
    }
}
