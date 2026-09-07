package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeToWorkPassedDate {
    public static void main(String[] args) {
        // 25. Xodimning ishga kirgan sanasidan beri necha yil, oy, kun o'tganini hisoblang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your to work passed year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your to work passed month: ");
        int month = scanner.nextInt();
        System.out.print("Enter your to work passed day: ");
        int day = scanner.nextInt();

        LocalDate toWorkPassedDate = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();

        Period period = Period.between(toWorkPassedDate,now);

        System.out.println("Year: " + period.getYears() + "\nMonth: " + period.getMonths() + "\nDay: " + period.getDays());
    }
}
