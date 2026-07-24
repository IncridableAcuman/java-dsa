package com.web.java_dsa.basic;

import java.util.Scanner;

public class HajmiTemperaturasi {
    public static void main(String[] args) {
        /*7. Temperaturasi t1, bo’lgan V1 hajmi suv temperaturasi t2 bo’lgan V2 hajmli suvga
             aralashtiriladi. Hosil bo’lgan suvning hajmi va temperaturasini aniqlovchi dastur tuzilsin.*/

        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int V1 = scanner.nextInt();

        int t2 = scanner.nextInt();
        int V2 = scanner.nextInt();

        int V = V1 + V2;

        int t = (( V1 + V2 )*t2 + V1 * t1)/(2 * V1 + V2);

        System.out.println("Vajmi: " + V);
        System.out.println("Temperaturasi: " + t);
    }
}
