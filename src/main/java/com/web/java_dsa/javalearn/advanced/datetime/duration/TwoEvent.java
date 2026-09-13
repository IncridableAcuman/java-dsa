package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class TwoEvent {
    public static void main(String[] args) {
        // 87. Ikki event orasida 5 minutdan kam vaqt qolganligini aniqlang.
        LocalTime first = LocalTime.of(10,40);
        LocalTime second = LocalTime.of(10,43);

        Duration duration = Duration.between(first,second);

        if (duration.toMinutes() < 5){
            System.out.println("5 daqiqadan kam vaqt qoldi");
        }
    }
}
