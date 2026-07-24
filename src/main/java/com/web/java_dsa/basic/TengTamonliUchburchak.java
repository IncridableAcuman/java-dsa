package com.web.java_dsa.basic;

import java.util.Scanner;

public class TengTamonliUchburchak {
    public static void main(String[] args) {
        /*5. Teng tomonli uchburchakning tomoni (a) berilgan. Uchburchakning yuzini hisoblovchi dastur
            tuzilsin.*/
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double S = Math.sqrt(3)/4*Math.pow(a,2);
        System.out.println("Yuza: " + S);
    }
}
