package com.web.java_dsa.kepuz;

import org.springframework.format.datetime.DateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KelgusiSana1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/149
        LocalDate date = LocalDate.now().plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String res = date.format(formatter);
        System.out.println(res);
    }
}
