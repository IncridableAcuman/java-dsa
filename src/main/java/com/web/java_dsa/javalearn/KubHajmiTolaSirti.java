package com.web.java_dsa.javalearn;

import java.util.Scanner;

public class KubHajmiTolaSirti {
    public static void main(String[] args) {
        /*Begin5. Kubning yon tomoni a berilgan. Uning hajmini va to'la sirtini topish*/
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int V = (int) Math.pow(a,3);
        int S = (int) (6 * Math.pow(a,2));

        System.out.println("Hajmi: " + V);
        System.out.println("To'la sirti: " + S);
    }
}
