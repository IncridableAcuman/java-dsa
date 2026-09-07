package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class AfterFortyFiveDays {
    public static void main(String[] args) {
        // 14. Berilgan sanadan 45 kun keyingi sanani hisoblang.
        LocalDate now = LocalDate.now();
        LocalDate afterFortyFiveDay = now.plusDays(45);
        System.out.println("After forty five day: " + afterFortyFiveDay);
    }
}
