package com.web.java_dsa.basic;

import java.util.Scanner;

public class UchishUzoqligi {
    public static void main(String[] args) {
        /*4. H balandlikdan erkin tushgan toshning uchish uzoqligini aniqlovchi dastur tuzilsin. (g=10
            erkin tushish tezlanishi)*/
        Scanner scanner = new Scanner(System.in);
        double H = scanner.nextDouble();
        final int g = 10;
        double t = Math.sqrt((2*H)/g);
        System.out.println("Time: " + t);
    }
}
