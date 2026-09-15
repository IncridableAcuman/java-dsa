package com.web.java_dsa.javalearn.advanced.datetime.instant;

import java.time.Instant;

public class CurrentDateTimeWithInstant {
    public static void main(String[] args) {
        // 106. Hozirgi Instantni oling.
        Instant now = Instant.now();
        System.out.println("Now: " + now);
    }
}
