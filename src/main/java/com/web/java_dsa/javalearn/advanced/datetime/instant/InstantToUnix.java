package com.web.java_dsa.javalearn.advanced.datetime.instant;

import java.time.Instant;

public class InstantToUnix {
    public static void main(String[] args) {
        /// 107. Instantni Unix timestampga aylantiring.
        Instant now = Instant.now();
        long unixSeconds = now.getEpochSecond();
        long unixMillis = now.toEpochMilli();
        System.out.println("Seconds: " + unixSeconds + "\nMillis: " + unixMillis);
    }
}
