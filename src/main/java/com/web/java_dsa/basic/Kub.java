package com.web.java_dsa.basic;

import java.util.Scanner;

public class Kub {
    public static void main(String[] args) {
        /*1. Kubning qirrasi (a) berilgan. Uning hajmini va yon tomoni yuzasini hisoblovchi dastur tuzilsin.
        * */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int V = (int) Math.pow(a,3); // kubning hajmini hisoblash formulasi
        int S = (int) (6 * Math.pow(a,2)); // kubning yon tamonini yuzini hisoblash formulasi
        System.out.println("Kubning hajmi: "+ V);
        System.out.println("Kubning yon tamonini yuzi: "+S);
    }
}
