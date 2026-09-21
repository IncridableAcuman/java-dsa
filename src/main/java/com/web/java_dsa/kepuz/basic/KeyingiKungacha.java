package com.web.java_dsa.kepuz.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class KeyingiKungacha {
    public static void main(String[] args) {
        // https://kep.uz/problems/301
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        /*
        int partHour = 23 - hour;
        int partMinute = 60 - minute;
        System.out.println(partHour * 60 + partMinute);

         */

        LocalDateTime current = LocalDateTime.of(LocalDate.now(), LocalTime.of(hour,minute));
        LocalDateTime tomorrow = current.plusDays(1).with(LocalTime.MIDNIGHT);

        long minutes = ChronoUnit.MINUTES.between(current,tomorrow);

        System.out.println(minutes);
    }
}
