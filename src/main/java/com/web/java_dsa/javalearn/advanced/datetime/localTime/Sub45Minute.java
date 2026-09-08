package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class Sub45Minute {
    public static void main(String[] args) {
        // 35. Berilgan vaqtdan 45 minut ayiring.
        LocalTime currentTime = LocalTime.now();
        currentTime = currentTime.minusMinutes(45);
        System.out.println(currentTime);
    }
}
