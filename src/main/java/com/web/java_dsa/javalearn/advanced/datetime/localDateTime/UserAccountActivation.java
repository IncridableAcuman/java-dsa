package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class UserAccountActivation {
    public static void main(String[] args) {
        // 62. User account yaratilganidan 7 kun o'tgan bo‘lsa activation muddatini tugagan deb belgilang.
        LocalDateTime createdAccount = LocalDateTime.of(2026,9,2,10,10);
        LocalDateTime current = LocalDateTime.now();
        Duration duration = Duration.between(createdAccount,current);
        System.out.println(duration.toDays() >= 7 ? "Token is expired" : "Token is not expired");
    }
}
