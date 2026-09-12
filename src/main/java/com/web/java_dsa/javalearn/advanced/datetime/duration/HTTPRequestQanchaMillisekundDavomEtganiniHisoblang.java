package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class HTTPRequestQanchaMillisekundDavomEtganiniHisoblang {
    public static void main(String[] args) {
        // HTTP request qancha millisekund davom etganini hisoblang
        LocalTime startRequest = LocalTime.now();
        LocalTime endRequest = LocalTime.now().plusSeconds(3);
        Duration duration = Duration.between(startRequest,endRequest);
        long mSecond = duration.toMillis();
        System.out.println(mSecond);
    }
}
