package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class UserLoginSession {
    public static void main(String[] args) {
        // 86. User session 30 minutdan uzun davom etsa "Long session" chiqaring.

        LocalDateTime loginTime = LocalDateTime.of(2026,9,13,10,10);
        LocalDateTime logoutTime = LocalDateTime.of(2026,9,13,10,45);

        Duration duration = Duration.between(loginTime,logoutTime);

        if (duration.toMinutes() > 30){
            System.out.println("Long session");
        }
    }
}
