package com.web.java_dsa.javalearn.advanced.datetime.duration;

import java.time.Duration;

public class MethodExecutionTime {
    public static void main(String[] args) {
        // 85. Method execution time'ni o‘lchang.
        //
        //start = ...
        //execute method
        //end = ...

        long start = System.nanoTime();

        executed();

        long end = System.nanoTime();

        Duration duration = Duration.ofMillis(end - start);

        long millis = duration.toMillis();

        System.out.println("Metod bajarilish vaqti: " + millis + "ns");

    }
    public static void executed(){
        for (int i=0;i<1_000_000;i++){
            Math.sin(i);
        }
    }
}
