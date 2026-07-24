package com.web.java_dsa.basic;

import java.util.Scanner;

public class UmumiyQarshilik {
    public static void main(String[] args) {
        /*8. R1,R2,R3 qarshilik parallel ulangan. Umumiy qarshilikni aniqlovchi dastur tuzilsin.*/
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();

        int R = (R1 * R2 * R3) / (R1 * R2 + R1 * R3 + R2 * R3);

        System.out.println(R);
    }
}
