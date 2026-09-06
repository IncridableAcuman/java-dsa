package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthDate {
    public static void main(String[] args) {
        // 16. Foydalanuvchining tug‘ilgan kunigacha qancha kun qolganini hisoblang.
        LocalDate birthDate = LocalDate.of(2003,10,10);
        LocalDate now = LocalDate.now();

        LocalDate nextBirthDate = birthDate.withYear(now.getYear());

        if (nextBirthDate.isBefore(now) || nextBirthDate.isEqual(now)){
            nextBirthDate=nextBirthDate.plusYears(1);
        }
        long daysLeft = ChronoUnit.DAYS.between(now,nextBirthDate);

        System.out.println(daysLeft);
    }
}
