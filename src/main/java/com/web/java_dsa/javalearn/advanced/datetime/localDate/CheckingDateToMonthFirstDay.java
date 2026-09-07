package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class CheckingDateToMonthFirstDay {
    public static void main(String[] args) {
        // 10. Berilgan sana yilning birinchi kuni ekanligini tekshiring.
        LocalDate now = LocalDate.now();
        int dayOfYear = now.getDayOfYear();

        boolean isEqual = dayOfYear == 1;

        System.out.println("Day of year: " + dayOfYear);
        System.out.println("First day of year? " + isEqual);

    }
}
