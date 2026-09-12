package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreeFormatLocalTime {
    public static void main(String[] args) {
        // 76. DateTimeFormatter yordamida vaqtni:
        //
        //14:35
        //14:35:20
        //02:35 PM
        //
        //formatlarida chiqaring.
        LocalTime time = LocalTime.now();
        DateTimeFormatter first = DateTimeFormatter.ofPattern("HH:mm");
        String firstFormat = first.format(time);
        DateTimeFormatter second = DateTimeFormatter.ofPattern("HH:mm:ss");
        String secondFormat = second.format(time);
        DateTimeFormatter third = DateTimeFormatter.ofPattern("HH:mm pm"); // pm yokida am ni avtomatik qilish mumkinmi?
        String thirdFormat = third.format(time);
        System.out.println("First: " + firstFormat + "\nSecond: " + secondFormat + "\nThird: " + thirdFormat);

    }
}
