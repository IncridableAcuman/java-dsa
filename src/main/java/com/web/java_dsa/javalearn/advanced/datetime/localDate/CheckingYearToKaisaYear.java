package com.web.java_dsa.javalearn.advanced.datetime.localDate;

import java.util.Scanner;

public class CheckingYearToKaisaYear {
    public static void main(String[] args) {
        // 8. Berilgan yil kabisa yili ekanligini aniqlang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("This is year Kaisa year: " + year);
        } else {
            System.out.println("This is not Kaisa year: " + year);
        }
    }
}
