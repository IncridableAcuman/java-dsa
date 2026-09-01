package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

/* // 1-usul
interface Additional{
    int add(int a,int b);
}

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        Additional additional = new Additional() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(additional.add(a,b));
    }
}*/
// 2-usul
// 1. Ikki sonni qo‘shish
//
//int qabul qilib, ularning yig‘indisini qaytaruvchi lambda yozing.
interface Additional{
    int add(int a,int b);
}

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();

       // Additional additional = (x,y)-> x + y; // first way
        Additional additional = Integer::sum;
        System.out.println(additional.add(a,b));
    }
}