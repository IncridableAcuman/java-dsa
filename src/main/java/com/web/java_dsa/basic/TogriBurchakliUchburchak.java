package com.web.java_dsa.basic;

import java.util.Scanner;

public class TogriBurchakliUchburchak {
    public static void main(String[] args) {
        /*2. To’g’ri burchakli uchburchakning katetlari a va b berilgan. Uchburchakning gepatenuzasi
            (c) va yuzi (s) ni hisoblovchi dastur tuzing.*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2)); // gipotenuzasini topish
        // katetlarningg kvadratlari yig'indisi gipotenuzaning kvadratlari yigindisiga teng
        int S = (a*b)/2; // to'g'ri burchakli uchburchak ning yuzini topish formulasi
        System.out.println("Gipotenuza: "+c);
        System.out.println("Yuza: "+S);
    }
}
