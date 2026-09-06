package com.web.java_dsa.javalearn.advanced.datetime;

import java.time.LocalDateTime;

public class ExtractOnlyDate {
    public static void main(String[] args) {
        // 17. LocalDateTime berilgan. Undan faqat sana qismini ajrating.
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.toLocalDate());
    }
}
