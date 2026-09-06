package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferenceDaysOfDate {
    public static void main(String[] args) {
        // 14. Berilgan ikkita LocalDate orasidagi kunlar sonini toping.
        LocalDate birthdate = LocalDate.of(2003,10,10);
        LocalDate now = LocalDate.now();
        long totalDays = ChronoUnit.DAYS.between(birthdate,now);

        System.out.println(totalDays);
    }
}
