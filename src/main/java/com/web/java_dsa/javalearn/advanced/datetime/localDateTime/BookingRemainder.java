package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class BookingRemainder {
    public static void main(String[] args) {
        // 57. Booking boshlanishidan 15 minut oldin reminder chiqaradigan dastur yozing.
        LocalDateTime booking = LocalDateTime.of(2026,9,10,15,57);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now,booking);
        int remainder = duration.toMinutesPart();
        System.out.println(remainder);
        if (remainder == 15){
            System.out.println("Booking is starting then 15 minutes");
        } else {
            System.out.println("Booking has not started yet");
        }
    }
}
