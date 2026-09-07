package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenBirthdayAndTodayDate {
    public static void main(String[] args) {
        // 21. Tug‘ilgan sana va bugungi sana orasidagi farqni Period orqali toping.
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(2003,10,10);

        Period period = Period.between(birthday,now);
        int year = period.getYears();
        System.out.println("Year: " + year);
        int month = period.getMonths();
        System.out.println("Month: " + month);
        int day = period.getDays();
        System.out.println("Day: " + day);
    }
}
