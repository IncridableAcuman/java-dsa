package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class AddTwoHour {
    public static void main(String[] args) {
        // 34. Berilgan vaqtga 2 soat qo‘shing.
        LocalTime currentTime = LocalTime.now();
        currentTime = currentTime.plusHours(2);
        System.out.println(currentTime);
    }
}
