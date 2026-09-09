package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class Adding5days {
    public static void main(String[] args) {
        // 49. Berilgan datetime'ga 5 kun qo‘shing.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Original: " + localDateTime);
        localDateTime = localDateTime.plusDays(5);
        System.out.println("Then: " + localDateTime);
    }
}
