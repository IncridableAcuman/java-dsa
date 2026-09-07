package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;

public class CreditDate {
    public static void main(String[] args) {
        // 26. Kredit muddati:
        //
        //2 yil 6 oy
        //
        //bo‘lsa, boshlang‘ich sanaga qo‘shing.
        LocalDate startingDate = LocalDate.now();

        LocalDate endingDate = startingDate.plusYears(2).plusMonths(6);

        System.out.println(endingDate);
    }
}
