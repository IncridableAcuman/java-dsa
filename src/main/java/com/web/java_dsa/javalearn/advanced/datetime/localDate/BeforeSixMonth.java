package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class BeforeSixMonth {
    public static void main(String[] args) {
        // 15. Berilgan sanadan 6 oy oldingi sanani toping.
        LocalDate now = LocalDate.now();
        LocalDate beforeSixMonth = now.minusMonths(6);
        System.out.println("Before six month: " + beforeSixMonth);
    }
}
