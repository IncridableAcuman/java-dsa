package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.util.Scanner;

public class CheckingToWorkingTime {
    public static void main(String[] args) {
        // 39. Foydalanuvchi kiritgan vaqt ish vaqtiga to‘g‘ri keladimi?
        //
        //09:00 - 18:00
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour: ");
        int hour = scanner.nextInt();
        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        LocalTime enteredTime = LocalTime.of(hour,minute);
        if (!enteredTime.isBefore(LocalTime.of(9,0)) && !enteredTime.isAfter(LocalTime.of(18,0))){
            System.out.println("Working time");
        } else {
            System.out.println("Not working time");
        }
    }
}
