package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class Plus90Minute {
    public static void main(String[] args) {
        // 41. Berilgan vaqtga 90 minut qo‘shing.
        LocalTime now = LocalTime.now();
        now = now.plusMinutes(90);
        System.out.println(now);
    }
}
