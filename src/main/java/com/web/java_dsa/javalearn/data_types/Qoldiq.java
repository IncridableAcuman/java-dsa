package com.web.java_dsa.javalearn.data_types;

import java.util.Scanner;

public class Qoldiq {
    public static void main(String[] args) {
        // Muallif: Abdusharipov Izzatbek
        // Sana 4.08.2026
        // Maqsad: n ni  m ga bo'lgandagi butun va qoldiq qismini hisoblash
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        System.out.print("m=");
        int m = scanner.nextInt();
        int mod = n%m;
        int butun = n/m;
        System.out.println("n % m = " + mod);
        System.out.println("n / m =  " + butun);
    }
}
