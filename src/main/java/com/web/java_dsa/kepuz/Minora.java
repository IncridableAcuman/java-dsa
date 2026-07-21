package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Minora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long x = (long) Math.pow(a,b);
        long y = (long) Math.pow(x,c);
        System.out.println(y);
    }
}
