package com.web.java_dsa.javalearn;

import java.util.Scanner;

public class ParalelpepedHajmiTolaSirt {
    public static void main(String[] args) {
        /*Begin6. Paralelepepidning tomonlari a, b, c berilgan. Uning hajmini va to'la sirtini topish*/
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int V = a * b * c;

        int S = 2 * ( a*b + b*c + a*c );

        System.out.println("Hajmi: " + V);
        System.out.println("To'la sirti: " + S);
    }
}
