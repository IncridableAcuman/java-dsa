package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DiffereceBetweenYearsOfTwoDate {
    public static void main(String[] args) {
        // 22. Ikki sana orasidagi faqat yillar farqini toping.
        LocalDate firstDate = LocalDate.of(2011,10,10);
        LocalDate secondDate = LocalDate.of(2026,10,10);

        Period period = Period.between(firstDate,secondDate);
        int year = period.getYears();
        System.out.println("Years: " + year);
    }
}
