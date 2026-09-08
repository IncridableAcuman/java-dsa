package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeWorkedDate {
    public static void main(String[] args) {
        // 30. Employee kompaniyada kamida 1 yil ishlaganligini Period yordamida aniqlang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ishga kirgan yilingizni kiriting(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("Ishga kirgan oyingizni kiriting(m): ");
        int month = scanner.nextInt();
        System.out.print("Ishga kirgan kuningizni kiriting(masalan 12 yokida 5): ");
        int day = scanner.nextInt();
        LocalDate passedToWork = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();
        Period period = Period.between(passedToWork,now);
        System.out.println(period.getYears() ==1 ? "Xodim 1 yil ishlagan" : "Yo'q ishlamagan");
    }
}
