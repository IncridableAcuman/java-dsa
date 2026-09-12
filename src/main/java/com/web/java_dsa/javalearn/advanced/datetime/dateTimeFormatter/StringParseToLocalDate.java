package com.web.java_dsa.javalearn.advanced.datetime.dateTimeFormatter;

import java.time.LocalDate;

public class StringParseToLocalDate {
    public static void main(String[] args) {
        // 70. Quyidagi Stringni LocalDatega parse qiling:
        //
        //2026-09-06

        String format = "2026-09-06";
        LocalDate localDate = LocalDate.parse(format);
        System.out.println("Parsed: " + localDate);
    }
}
