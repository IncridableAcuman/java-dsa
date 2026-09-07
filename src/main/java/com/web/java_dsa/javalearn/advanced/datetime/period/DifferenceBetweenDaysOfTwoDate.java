package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenDaysOfTwoDate {
    public static void main(String[] args) {
        // 24. Ikki sana orasidagi faqat kunlar farqini toping.
        LocalDate firstDate = LocalDate.of(2011,10,10);
        LocalDate secondDate = LocalDate.of(2026,10,25);

        Period period = Period.between(firstDate,secondDate);
        int days = period.getDays();
        System.out.println("Days: " + days);
    }
}
