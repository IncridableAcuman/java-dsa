package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;

public class ExtractHourMinuteSecondFromLocalTime {
    public static void main(String[] args) {
        // 33. Vaqtdan soat, minut, sekund va nanosekundni ajrating.
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano();
        System.out.println( hour + " hour, " + minute + " minute, " + second +
                " second, " + nanosecond + " nanosecond");
    }
}
