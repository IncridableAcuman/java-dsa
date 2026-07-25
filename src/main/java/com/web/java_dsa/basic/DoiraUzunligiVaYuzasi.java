package com.web.java_dsa.basic;

import java.util.Scanner;

public class DoiraUzunligiVaYuzasi {
    public static void main(String[] args) {
        /*Doiraning radiusi R berilgan. Uning uzunligi L va yuzasi S aniqlansin.*/
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();

        int L = (int) (2 * Math.PI * R);
        int S = (int) (Math.PI * Math.pow(R,2));

        System.out.println("Uzunligi: " + L +  "\n" + "Yuzasi: " + S);
    }
}
