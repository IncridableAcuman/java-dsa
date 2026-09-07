package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class AfterTenDays {
    public static void main(String[] args) {
        //11. Bugungi sanadan 10 kun keyingi sanani toping.
        LocalDate now = LocalDate.now();
        LocalDate afterTenDays = now.plusDays(10);
        System.out.println("After ten days: " + afterTenDays);
    }
}
