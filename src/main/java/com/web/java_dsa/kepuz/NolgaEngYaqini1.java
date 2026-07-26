package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NolgaEngYaqini1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/158
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>0 && b>0){
            System.out.println(Math.min(a,b));
        } else if (Math.abs(a) > Math.abs(b)) {
            System.out.println(b);
        } else if (Math.abs(a) < Math.abs(b)){
            System.out.println(a);
        }
    }
}
