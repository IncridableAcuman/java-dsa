package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {
        // 31. Hozirgi vaqtni chiqaring.
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
    }
}
