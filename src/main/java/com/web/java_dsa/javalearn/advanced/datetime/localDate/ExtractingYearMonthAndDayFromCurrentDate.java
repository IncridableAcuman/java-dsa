package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.time.Month;

public class ExtractingYearMonthAndDayFromCurrentDate {
    public static void main(String[] args) {
        // 4. Berilgan sananing yilini, oyini va kunini alohida chiqaring.
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        Month month = now.getMonth();
        int day = now.getDayOfMonth();

        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + day);

//        System.out.println("Year: " + year);
//        System.out.println("Month: " + month);
//        System.out.println("Day: " + day);
    }
}
