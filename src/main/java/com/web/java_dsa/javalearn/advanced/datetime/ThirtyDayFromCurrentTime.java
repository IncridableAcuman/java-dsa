package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDate;

public class ThirtyDayFromCurrentTime {
    public static void main(String[] args) {
        // 13. Bugungi kundan 30 kun keyingi sanani toping.
        LocalDate today = LocalDate.now();

        LocalDate future = today.plusDays(30);

        System.out.println(future);
    }
}
