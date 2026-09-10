package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class OrderDateTime {
    public static void main(String[] args) {
        // 55. Order yaratilganidan beri 24 soatdan ko‘p vaqt o'tganligini aniqlang.
        LocalDateTime order = LocalDateTime.of(2026,9,9,10,10);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(order,now);
        long hours = duration.toHours();
        System.out.println(hours > 24 ? "Yes" : "No");
    }
}
