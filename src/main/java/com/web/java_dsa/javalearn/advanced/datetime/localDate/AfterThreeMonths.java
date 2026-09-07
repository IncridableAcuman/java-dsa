package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class AfterThreeMonths {
    public static void main(String[] args) {
        // 12. Bugungi sanadan 3 oy keyingi sanani toping.
        LocalDate now = LocalDate.now();
        LocalDate afterThreeMonths = now.plusMonths(3);
        System.out.println("After three months: " + afterThreeMonths);
    }
}
