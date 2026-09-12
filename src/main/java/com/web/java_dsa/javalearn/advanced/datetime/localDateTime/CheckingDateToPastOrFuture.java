package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class CheckingDateToPastOrFuture {
    public static void main(String[] args) {
        // 61. Berilgan datetime o'tganmi yoki kelajakdagi vaqtmi aniqlang.
        LocalDateTime dateTime = LocalDateTime.of(2025,10,10,20,20);
        LocalDateTime current = LocalDateTime.now();

        if (!dateTime.isAfter(current)){
            System.out.println("Past");
        } else {
            System.out.println("Future");
        }
    }
}
