package com.web.java_dsa.basic;

import java.util.Scanner;

public class AylanaUzunligi {
    public static void main(String[] args) {
        /*Begin4. Aylananing diametri d berilgan. Uning uzunligi aniqlansin*/
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int L = (int) (Math.PI * d); // L = pi * d;
        System.out.println(L);
    }
}
