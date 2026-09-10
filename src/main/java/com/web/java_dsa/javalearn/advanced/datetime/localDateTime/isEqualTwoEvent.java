package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.LocalDateTime;

public class isEqualTwoEvent {
    public static void main(String[] args) {
        // 59. Ikki event bir vaqtda sodir bo‘lishi mumkinligini aniqlang.
        LocalDateTime first = LocalDateTime.of(2026,9,10,15,33);
        LocalDateTime second = LocalDateTime.of(2026,9,10,15,33);
        if (first.equals(second)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
