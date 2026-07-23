package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class IntervalgaTegishlilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<=4 && b<=4){
            System.out.println(a+" "+b);
        } else if (a<=4 && b>4) {
            System.out.println(a);
        } else if (b<=4 && a>4){
            System.out.println(b);
        }
    }
}
