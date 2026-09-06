package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.*;

public class DayOfWeek {
    public static void main(String[] args) {
        // 12. Berilgan LocalDate hafta kunini aniqlang.
        LocalDate date = LocalDate.now();

        java.time.DayOfWeek week = date.getDayOfWeek();

        //System.out.println(week); // MONDAY/TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

        String dayName = week.name();

        System.out.println(dayName);//

        int dayValue = week.getValue();

        System.out.println(dayValue);
    }
}
