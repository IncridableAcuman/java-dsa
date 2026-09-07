package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenMonthOfTwoDate {
    public static void main(String[] args) {
        // 23. Ikki sana orasidagi faqat oylar farqini toping.
        LocalDate firstDate = LocalDate.of(2011,10,10);
        LocalDate secondDate = LocalDate.of(2026,12,10);

        Period period = Period.between(firstDate,secondDate);
        int month = period.getMonths();
        System.out.println("Month: " + month);
    }
}
