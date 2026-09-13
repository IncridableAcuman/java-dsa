package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;
import java.time.Instant;

public class BackendResponseTime {
    public static void main(String[] args) {
        // 90. Backend service response time'ni o‘lchab:
        //
        //< 100ms     FAST
        //100-500ms   NORMAL
        //> 500ms     SLOW
        //
        //deb belgilang.

        Instant start = Instant.now();

        processing();

        Instant end = Instant.now();

        Duration duration = Duration.between(start,end);

        long millis = duration.toMillis();

        if (millis < 100){
            System.out.println("Status: FAST");
        } else if (millis <= 500) {
            System.out.println("Status: NORMAL");
        } else {
            System.out.println("Status: SLOW");
        }
    }
    public static void processing(){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
