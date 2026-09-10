package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CheckingToDayOfWeek {
    public static void main(String[] args) {
        // 58. Berilgan LocalDateTime hafta oxiriga to‘g‘ri keladimi?
        LocalDateTime localDateTime = LocalDateTime.now();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        if (DayOfWeek.SATURDAY == dayOfWeek || DayOfWeek.SUNDAY == dayOfWeek){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
