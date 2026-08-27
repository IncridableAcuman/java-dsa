package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class RaqamlarYigindisiTeskariMasala {
    public static void main(String[] args) {
        // https://kep.uz/problems/1275
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n>9){
            sb.append(9);
            n-=9;
        }
        if (n>0){
            sb.append(n);
        }
        System.out.println(sb.reverse());
    }
}
