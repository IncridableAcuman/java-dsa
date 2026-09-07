package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class BeforeTwoYears {
    public static void main(String[] args) {
        // 13. Bugungi sanadan 2 yil oldingi sanani toping.
        LocalDate now = LocalDate.now();
        LocalDate beforeTwoYears = now.minusYears(2);
        System.out.println("Before two years: " + beforeTwoYears);
    }
}
