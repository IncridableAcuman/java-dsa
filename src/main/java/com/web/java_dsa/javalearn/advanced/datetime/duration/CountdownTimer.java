package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;

public class CountdownTimer {
    public static void main(String[] args) {
        // 89. Countdown timer yarating.
        Duration duration = Duration.ofDays(10);
        System.out.print("Timer ishga tushdi...");

        while (!duration.isZero() && !duration.isNegative()){
            long days = duration.toDaysPart();
            long hours = duration.toHoursPart();
            long minutes = duration.toMinutesPart();
            long seconds = duration.toSecondsPart();

            System.out.printf("%02d:%02d:%02d:%02d\r",days,hours,minutes,seconds);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.print("Timer to'xtatildi");
                Thread.currentThread().interrupt();
                return;
            }
            duration = duration.minusSeconds(1);
        }
        System.out.println("Vaqt tugadi");
    }
}
