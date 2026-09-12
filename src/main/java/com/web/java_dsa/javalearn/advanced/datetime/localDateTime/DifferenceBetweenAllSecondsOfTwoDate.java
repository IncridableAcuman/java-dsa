package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DifferenceBetweenAllSecondsOfTwoDate {
    public static void main(String[] args) {
        // 65. Ikki datetime orasidagi jami sekundlarni toping.
        LocalDateTime fist = LocalDateTime.now();
        LocalDateTime second = LocalDateTime.now().plusMinutes(1);
        Duration duration = Duration.between(fist,second);
        long seconds = duration.getSeconds();
        System.out.println("Seconds: " + seconds);
    }
}
