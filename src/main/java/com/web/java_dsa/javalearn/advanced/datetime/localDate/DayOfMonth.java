package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class DayOfMonth {
    public static void main(String[] args) {
        // 6. Berilgan sana oyning nechanchi kuni ekanini aniqlang.
        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();

        System.out.println("Day of month: " + dayOfMonth);
    }
}
