package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.time.LocalDate;

public class Age18Date {
    public static void main(String[] args) {
        // 19. Foydalanuvchining 18 yoshga to‘lish sanasini hisoblang.
        LocalDate birthday = LocalDate.of(2003,10,10);
        LocalDate age18Date = birthday.plusYears(18);

        System.out.println("Age 18 date is " + age18Date);
    }
}
