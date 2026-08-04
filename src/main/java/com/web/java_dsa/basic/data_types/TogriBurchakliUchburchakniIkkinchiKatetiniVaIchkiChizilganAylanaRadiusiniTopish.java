package com.web.java_dsa.basic.data_types;

import java.util.Scanner;

public class TogriBurchakliUchburchakniIkkinchiKatetiniVaIchkiChizilganAylanaRadiusiniTopish {
    public static void main(String[] args) {
        /*
        * Muallif: Abdusharipo Izzatbek
        * Sana: 04.08.2026
        * Maqsad: To’g’ri burchakli uchburchakning gepotenuzasi (c) va kateti (a) berilgan. Uchburchakning
ikkinchi kateti (b) va uchburchakka ichki chizilgan aylana radiusini topuvchi programma tuzilsin.
        * */
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int a = scanner.nextInt();

        int b = (int) Math.sqrt(Math.pow(c,2) - Math.pow(a,2));

        int r = ( a + b + c ) / (a * b );

        System.out.println("Kateti(b): " + b);
        System.out.println("Ichki chizilgan aylana radiusi: " + r);
    }
}
