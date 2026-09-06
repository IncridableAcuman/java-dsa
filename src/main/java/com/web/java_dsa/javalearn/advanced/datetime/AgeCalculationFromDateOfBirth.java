package com.web.java_dsa.javalearn.advanced.datetime;


import java.time.LocalDate;
import java.time.Period;

public class AgeCalculationFromDateOfBirth {
    public static void main(String[] args) {
        //11. Tug‘ilgan sanani LocalDate sifatida qabul qilib, foydalanuvchining yoshini hisoblang.
        LocalDate date = LocalDate.of(2003,10,10);
        LocalDate now = LocalDate.now();

        Period period = Period.between(date,now);

        System.out.println(period.getYears());
    }
}
