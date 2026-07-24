package com.web.java_dsa.basic;

import java.util.Scanner;

public class TebranishDavri {
    public static void main(String[] args) {
        /*6. L uzunlikdagi matematik mayatnikning tebranish davrini hisoblovchi dastur tuzilsin.*/
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        final int g=10;
        double T = 2 * Math.PI * Math.sqrt( (2 * L) / g );

        System.out.println("Davr: " + T);
    }
}
