package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class IsAfterTwoDate {
    public static void main(String[] args) {
        // 16. Ikki sana orasidagi qaysi biri oldin ekanligini aniqlang.

        LocalDate now = LocalDate.now();
        LocalDate afterOneDay = now.plusDays(1);

        if (now.isBefore(afterOneDay)){
            System.out.println(now + " sanasi " + afterOneDay + " sanasidan oldin keladi. ");
        } else if (now.isAfter(afterOneDay)) {
            System.out.println(now + " sanasi " + afterOneDay + " sanasidan keyin keladi.");
        } else {
            System.out.println("Ikkala san ham teng");
        }

    }
}
