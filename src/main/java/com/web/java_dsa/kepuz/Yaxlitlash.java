package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Yaxlitlash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = a - Math.floor(a);
        if (b>=0.5){
            System.out.println((int) Math.ceil(a));
        } else {
            System.out.println((int) Math.floor(a));
        }
    }
}
