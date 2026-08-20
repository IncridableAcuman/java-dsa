package com.web.java_dsa.javalearn.data_types;

import java.util.Scanner;

public class GeronFormulasiAsosidaUchburchakYuziniHisoblash {
    public static void main(String[] args) {
        // Muallif: Abdusharipov Izzatbek
        // Sana: 04.08.2026
        // Maqsad: a,b,c tamonlari berilgan uchburchakni geron formulasi asosida
        // yuzini hisoblash
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int P = (a + b + c) / 2;

        double S = Math.sqrt(P * ( P - a ) * ( P - b ) * ( P - c));

        System.out.println("Yuzasi: " + S);
    }
}
