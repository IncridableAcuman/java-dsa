package com.web.java_dsa.basic;

import java.util.Scanner;

public class OrtaArifmetikVaGeometrik {
    public static void main(String[] args) {
        /*3. Ikkita haqiqiy musbat son berilgan. Shu sonlarning o’rta arifmetigini va o'rta
            geometrigini aniqlovchi dastur tuzilsin.
        * */
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double arifmetik = (a+b)/2;
        double geometrik = Math.sqrt(a*b);

        System.out.println("Arithmetic: " + arifmetik);
        System.out.println("Geometric: " + geometrik);
    }
}
