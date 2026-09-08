package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;
import java.time.Period;

public class NextBirthday {
    public static void main(String[] args) {
        // 29. Foydalanuvchining keyingi tug‘ilgan kunigacha bo‘lgan vaqtni hisoblang.
        LocalDate birthday = LocalDate.of(2003,10,10);
        LocalDate now = LocalDate.now();

        LocalDate nextBirthday = birthday.withYear(now.getYear());

        if (nextBirthday.isBefore(now) || nextBirthday.isEqual(now)){
            nextBirthday = nextBirthday.plusYears(1);
        }
        Period period = Period.between(now,nextBirthday);

        System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
    }
}
