package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;

public class CreateTimer {
    public static void main(String[] args) {
        // 88. Timer yarating:
        //
        //00:05:00
        //
        //va har sekundda qolgan vaqtni ko‘rsating.
        Duration duration = Duration.ofMinutes(5);
        while (!duration.isZero() && !duration.isNegative()){
            long hours = duration.toHours();
            long minutes = duration.toMinutesPart();
            long seconds = duration.toSecondsPart();

            System.out.printf("%02d:%02d:%02d%n",hours,minutes,seconds);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Stopped timer");
                break;
            }
            duration = duration.minusSeconds(1);
        }
        System.out.println("Time is up! (00:00:00)");
    }
}
