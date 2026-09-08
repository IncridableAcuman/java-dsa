package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.util.Scanner;

public class HourMinuteSecond {
    public static void main(String[] args) {
        // 32. Berilgan soat, minut va sekunddan LocalTime yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter second: ");
        int second = scanner.nextInt();

        LocalTime localTime = LocalTime.of(hour,minute,second);

        System.out.println("Local time: " + localTime);
    }
}
