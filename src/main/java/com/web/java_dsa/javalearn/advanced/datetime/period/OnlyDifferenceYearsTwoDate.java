package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class OnlyDifferenceYearsTwoDate {
    // 22. Ikki sana orasidagi faqat yillar farqini toping.
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2008,10,10);
        LocalDate secondDate = LocalDate.of(2014,10,10);
        Period period = Period.between(firstDate,secondDate);
        System.out.println("Year: " + period.getYears());
    }

}
