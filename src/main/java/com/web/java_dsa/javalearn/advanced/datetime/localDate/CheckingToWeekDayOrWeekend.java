package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CheckingToWeekDayOrWeekend {
    public static void main(String[] args) {
        // 20. Berilgan sana dam olish kunimi yoki ish kunimi aniqlang.

        LocalDate now = LocalDate.now();

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY){
            System.out.println("Today is " + dayOfWeek + " day off");
        } else {
            System.out.println("Today is " + dayOfWeek + " working day");
        }
    }
}
