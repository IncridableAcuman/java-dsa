package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class CheckingRestaurantOpenOrClose {
    public static void main(String[] args) {
        // 38. Restaurant:
        //
        //09:00 - 22:00
        //
        //oralig‘ida ochiq ekanligini tekshiring.

        LocalTime now = LocalTime.now();
        LocalTime nineAM = LocalTime.of(9,0);
        LocalTime tenPM = LocalTime.of(22,0);

        if (!now.isBefore(nineAM) && !now.isAfter(tenPM)){
            System.out.println("Restaurant is open");
        } else {
            System.out.println("Restaurant is close");
        }
    }
}
