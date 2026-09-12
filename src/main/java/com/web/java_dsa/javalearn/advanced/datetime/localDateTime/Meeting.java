package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class Meeting {
    public static void main(String[] args) {
        // 60. Meeting:
        //
        //2026-09-06 14:00
        //
        //da boshlanadi va 2 soat 45 minut davom etadi. Tugash vaqtini toping.

        LocalDateTime start = LocalDateTime.of(2026,9,6,14,0);
        LocalDateTime end = start.plusHours(2).plusMinutes(45);
        System.out.println(end);
    }
}
