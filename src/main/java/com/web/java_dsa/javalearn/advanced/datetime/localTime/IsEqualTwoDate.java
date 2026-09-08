package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class IsEqualTwoDate {
    public static void main(String[] args) {
        // 37. Ikki vaqt tengligini tekshiring.
        LocalTime first = LocalTime.now();
        LocalTime second = LocalTime.now();
        if (first.equals(second)){
            System.out.println("Two dates are equal");
        } else {
            System.out.println("Two dates don't equal");
        }
    }
}
