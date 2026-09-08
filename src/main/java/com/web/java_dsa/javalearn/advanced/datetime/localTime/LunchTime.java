package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.util.Scanner;

public class LunchTime {
    public static void main(String[] args) {
        // 40. Berilgan vaqt tushlik vaqtiga to‘g‘ri keladimi?
        //
        //12:00 - 14:00
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour: ");
        int hour = scanner.nextInt();
        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        LocalTime enteredTime = LocalTime.of(hour,minute);

        LocalTime greaterOrEqualToTwelve  = LocalTime.of(12,0);
        LocalTime greaterOrEqualToForty = LocalTime.of(14,0);

        if (!enteredTime.isBefore(greaterOrEqualToTwelve) && !enteredTime.isAfter(greaterOrEqualToForty)){
            System.out.println("Lunch time");
        } else {
            System.out.println("Not lunch time");
        }
    }
}
