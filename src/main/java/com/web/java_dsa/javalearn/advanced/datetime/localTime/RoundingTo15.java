package com.web.java_dsa.javalearn.advanced.datetime.localTime;

import java.time.LocalTime;
import java.util.Scanner;

public class RoundingTo15 {
    public static void main(String[] args) {
        // 44. Berilgan vaqtni eng yaqin 15 minutlik intervalga yaxlitlang.
        //
        //Masalan:
        //
        //10:07 → 10:00
        //10:08 → 10:15
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour: ");
        int hour = scanner.nextInt();
        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        LocalTime enteredTime = LocalTime.of(hour,minute);

        int currentMinute = enteredTime.getMinute();
        int roundedMinute = ( ( currentMinute + 7 )/ 15 ) *15;

        LocalTime roundedTime;
        if (roundedMinute == 60){
            roundedTime = enteredTime.plusHours(1).plusMinutes(0);
        } else {
            roundedTime = enteredTime.withMinute(roundedMinute);
        }
        System.out.println("Original time: " + enteredTime);
        System.out.println("Rounded time: " + roundedTime);
    }
}
