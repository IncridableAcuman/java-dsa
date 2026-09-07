package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CheckingEqualToTwoDate {
    public static void main(String[] args) {
        // 17. Ikki sana tengligini tekshiring.
        LocalDate now = LocalDate.now();
        LocalDate afterTenDay = now.plusDays(10);

       long days = ChronoUnit.DAYS.between(now,afterTenDay);
        System.out.println(days == 0 ? "Yes" : "No");
    }
}
