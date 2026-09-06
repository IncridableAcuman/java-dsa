package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.util.Scanner;

public class CreatingLocalDateWithYearMonthAndDay {
    public static void main(String[] args) {
        // 2. Berilgan yil, oy va kundan LocalDate yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        LocalDate localDate = LocalDate.of(year,month,day);
        System.out.println(localDate);
    }
}
