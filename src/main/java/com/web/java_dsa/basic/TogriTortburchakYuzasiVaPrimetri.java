package com.web.java_dsa.basic;

import java.util.Scanner;

public class TogriTortburchakYuzasiVaPrimetri {
    public static void main(String[] args) {
        /**3. To`g`ri to`rtburchakning tomonlari a va b berilgan. Uning yuzasi S = a * b; va
         P = 2 * (a + b) perimetri aniqlansin. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Yuzasi
        int S = a * b;
        // Primetri
        int P = 2 * ( a + b );
        System.out.println("Yuzasi: " + S);
        System.out.println("Primetri: " + P);
    }
}
