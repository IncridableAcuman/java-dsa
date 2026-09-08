package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DifferenceMinutes {
    public static void main(String[] args) {
        // 42. Ikki vaqt orasidagi minutlar sonini toping.
        LocalTime first = LocalTime.of(10,2);
        LocalTime second = LocalTime.of(14,48);
        long difference  = ChronoUnit.MINUTES.between(first,second);

        System.out.println("Minutes: " + difference);
    }
}
