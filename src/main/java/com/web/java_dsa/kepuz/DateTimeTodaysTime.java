package com.web.java_dsa.kepuz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeTodaysTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format = date.format(formatter);
        System.out.println(format);
    }
}
