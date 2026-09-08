package com.web.java_dsa.javalearn.advanced.datetime.period;

import java.time.LocalDate;

public class SubscriptionPeriod {
    public static void main(String[] args) {
        // 27. Subscription muddati:
        //
        // 1 yil 3 oy
        // bo‘lsa, tugash sanasini toping.
        LocalDate subscription = LocalDate.now();
        LocalDate endSubscription = subscription.plusYears(1).plusMonths(6);
        System.out.println(endSubscription);
    }
}
