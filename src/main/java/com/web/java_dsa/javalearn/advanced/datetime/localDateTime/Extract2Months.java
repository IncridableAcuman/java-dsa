package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class Extract2Months {
    public static void main(String[] args) {
        // 51. Berilgan datetime'dan 2 oy ayiring.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("original: " + localDateTime);
        localDateTime = localDateTime.minusMonths(2);
        System.out.println("then: " + localDateTime);
    }
}
