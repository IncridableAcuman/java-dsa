package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;
import java.time.Month;


public class UzbekMonthName {
    public static void main(String[] args) {
        // 80. O'zbek tilida oy nomini chiqarishga harakat qiling.
        //
        //Masalan:
        //
        //06 sentyabr 2026
        LocalDate date = LocalDate.now();
        String[] uzbekMonthNames = {"Yanvar","Fevral","Mart","Aprel","May","Iyun","Iyul","Avgust","Sentyabr",
        "Oktyabr","Noyabr","Dekabr"};
        long day = date.getDayOfMonth();
        long year = date.getYear();
        Month month = date.getMonth();
    }
}
