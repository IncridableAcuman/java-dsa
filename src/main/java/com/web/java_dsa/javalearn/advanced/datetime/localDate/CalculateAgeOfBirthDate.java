package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeOfBirthDate {
    public static void main(String[] args) {
        // 18. Tug‘ilgan sanadan foydalanib yoshni hisoblang.
        LocalDate  birthDate = LocalDate.of(2003,10,10);
        LocalDate now = LocalDate.now();

        Period period = Period.between(birthDate,now);

        System.out.println(period.getYears());
    }
}
