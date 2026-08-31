package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class SonlarniTaqqoslash {
    public static void main(String[] args) {
        // https://kep.uz/problems/562
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a==b){
            System.out.println("=");
        } else if (a>b){
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        }
    }
}
