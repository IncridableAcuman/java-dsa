package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class DayOfYear {
    public static void main(String[] args) {
        // 7. Berilgan sana yilning nechanchi kuni ekanini toping.
        LocalDate now = LocalDate.now();
        int dayOfYear = now.getDayOfYear();
        System.out.println("Day of year: " + dayOfYear);
    }
}
