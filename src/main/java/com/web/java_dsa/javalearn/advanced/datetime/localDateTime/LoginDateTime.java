package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class LoginDateTime {
    public static void main(String[] args) {
        // 54. Login vaqtini berib, user 30 minutdan ko‘proq oldin login qilganligini tekshiring.
        LocalDateTime loginDateTime = LocalDateTime.of(2026,9,10,12,18);
        LocalDateTime currentDateTime = LocalDateTime.now();
        Duration duration = Duration.between(loginDateTime,currentDateTime);
        long minutes = duration.toMinutes();
        System.out.println(minutes > 30 ? "Yes" : "No");
    }
}
