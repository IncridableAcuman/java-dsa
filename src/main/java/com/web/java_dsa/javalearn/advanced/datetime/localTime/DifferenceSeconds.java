package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DifferenceSeconds {
    public static void main(String[] args) {
        // 43. Ikki vaqt orasidagi sekundlar sonini toping.
        LocalTime first = LocalTime.of(10,2,23);
        LocalTime second = LocalTime.of(14,48,53);
        long difference  = ChronoUnit.SECONDS.between(first,second);

        System.out.println("Seconds: " + difference);
    }
}
