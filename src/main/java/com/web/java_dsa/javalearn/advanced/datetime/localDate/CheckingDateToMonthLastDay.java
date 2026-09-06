package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class CheckingDateToMonthLastDay {
    public static void main(String[] args) {
        // 9. Berilgan sana oyning oxirgi kuni ekanligini tekshiring.
        LocalDate date = LocalDate.of(2026,10,10);
        int dayOfMonth = date.getDayOfMonth();
        int lastDatOfMonth = date.lengthOfMonth();

        boolean isLast = dayOfMonth == lastDatOfMonth;
        System.out.println("Day of month: " + dayOfMonth + "\nIs last dat of month? " + isLast);
    }
}
