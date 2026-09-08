package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceTwoDatePeriod {
    public static void main(String[] args) {
        // 28. Ikki sana orasidagi Periodni chiqarib, "2 years 3 months 5 days" formatida ko‘rsating.
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        Period period = Period.between(today,tomorrow);
        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        System.out.println(year + " years " + month + " months " + day + " days");
    }
}
