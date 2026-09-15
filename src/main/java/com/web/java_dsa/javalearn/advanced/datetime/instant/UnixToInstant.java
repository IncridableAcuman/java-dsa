package com.web.java_dsa.javalearn.advanced.datetime.instant;

import java.time.Instant;

public class UnixToInstant {
    public static void main(String[] args) {
        // 108. Unix timestampni Instantga aylantiring.
        long unixSeconds = 1789472515;
        Instant instant = Instant.ofEpochSecond(unixSeconds);
        System.out.println("Instant: " + instant);
    }
}
