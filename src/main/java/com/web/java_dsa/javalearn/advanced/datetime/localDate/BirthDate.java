package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        // 3. Tug‘ilgan sanangizni LocalDate sifatida yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month: ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();

        long difference =  ChronoUnit.YEARS.between(birthDate,now);

        System.out.println(difference);
    }
}
