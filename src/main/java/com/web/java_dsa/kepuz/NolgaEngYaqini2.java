package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NolgaEngYaqini2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/159
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int x = Math.abs(a);
        int y = Math.abs(b);
        int z = Math.abs(c);
        if ((x>=y && y>=z) || (y>=x && x>=z)) {
            System.out.println(c);
        } else if ((y>=z && z>=x) || (z>=y && y>=x)) {
            System.out.println(a);
        } else if ((x>=z && z>y) || (z>=x && x>=y)) {
            System.out.println(b);
        }
    }
}
