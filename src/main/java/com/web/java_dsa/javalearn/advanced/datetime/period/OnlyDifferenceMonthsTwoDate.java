package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class OnlyDifferenceMonthsTwoDate {
    public static void main(String[] args) {
        // 23. Ikki sana orasidagi faqat oylar farqini toping.
        LocalDate first = LocalDate.of(2022,12,6);
        LocalDate second = LocalDate.of(2026,4,9);
        Period period = Period.between(first,second);
        System.out.println("Months: " + period.getMonths());
    }
}
