package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CheckingToFreeTime {
    public static void main(String[] args) {
        // 15. Berilgan sana dam olish kunimi yoki yo‘qmi aniqlang.
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println((dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) ? "Yes" : "No");
    }
}
