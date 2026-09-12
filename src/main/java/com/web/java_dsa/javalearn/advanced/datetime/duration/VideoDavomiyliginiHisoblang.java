package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class VideoDavomiyliginiHisoblang {
    public static void main(String[] args) {
        //83. Video davomiyligini hisoblang.
        //
        //Start: 10:15:30
        //End:   12:45:20
        LocalTime start = LocalTime.of(10,15,30);
        LocalTime end = LocalTime.of(12,45,20);
        Duration duration = Duration.between(start,end);
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
