package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.util.Scanner;

public class OnlineMeeting {
    public static void main(String[] args) {
        // 45. Online meeting boshlanish vaqtiga 1 soat 30 minut qo‘shib tugash vaqtini toping.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour: ");
        int hour = scanner.nextInt();
        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        LocalTime enteredTime = LocalTime.of(hour,minute);
        LocalTime endedMeeting = enteredTime.plusHours(1).plusMinutes(30);
        System.out.println("Meeting end at: " + endedMeeting);

    }
}
