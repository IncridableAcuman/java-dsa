package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreeFormatLocalDate {
    public static void main(String[] args) {
        // 75. Bir xil sanani 3 xil formatda chiqaring:
        //
        //06.09.2026
        //06/09/2026
        //September 6, 2026

        LocalDate date = LocalDate.now();
        DateTimeFormatter first = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String firstFormat = first.format(date);
        DateTimeFormatter second = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String secondFormat = second.format(date);
        DateTimeFormatter third = DateTimeFormatter.ofPattern("MMM dd yyyy");
        String thirdFormat = third.format(date);
        System.out.println("First: " + firstFormat + "\nSecond: " + secondFormat + "\nThird: " + thirdFormat);
    }
}
