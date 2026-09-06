package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFromLocalDate {
    public static void main(String[] args) {
        // 5. Berilgan sana haftaning qaysi kuniga to‘g‘ri kelishini aniqlang.
        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("Day of week: " + dayOfWeek); // Day of week: SUNDAY
    }
}
