package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfWeekDDMMMYYYYFormat {
    public static void main(String[] args) {
        // 79. Formatter yordamida "Sunday, 06 September 2026" formatini yarating.
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String format = formatter.format(date);
        System.out.println(dayOfWeek + " " + format); // FRIDAY 11 Sep 2026
    }
}
