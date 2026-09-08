package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class WhichBefore {
    public static void main(String[] args) {
        // 36. Ikki LocalTime orasidagi qaysi biri oldinligini aniqlang.
        LocalTime first = LocalTime.now();
        LocalTime second = LocalTime.now().plusMinutes(5);
        if (first.isAfter(second)){
            System.out.println("First: " + first);
        } else {
            System.out.println("Second: " + second);
        }
    }
}
