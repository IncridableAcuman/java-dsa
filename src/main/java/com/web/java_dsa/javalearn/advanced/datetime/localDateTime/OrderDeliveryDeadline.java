package com.web.java_dsa.javalearn.advanced.datetime.localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class OrderDeliveryDeadline {
    public static void main(String[] args) {
        // 63. Order 3 soat ichida yetkazilishi kerak. Delivery deadline'ni hisoblang.
        LocalDateTime order = LocalDateTime.of(2026,9,10,20,10);
        LocalDateTime current = LocalDateTime.now();
        Duration duration = Duration.between(order,current);
        long hours = duration.toHours();
        System.out.println(hours < 3 ? "Hali vaqt bor" : "Vaqt tugagan");
    }
}
