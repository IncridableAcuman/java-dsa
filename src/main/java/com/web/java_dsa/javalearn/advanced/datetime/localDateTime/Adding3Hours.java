package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class Adding3Hours {
    public static void main(String[] args) {
        // 50. Berilgan datetime'ga 3 soat qo‘shing.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Original: " + localDateTime);
        localDateTime = localDateTime.plusHours(3);
        System.out.println("Then: " + localDateTime);
    }
}
