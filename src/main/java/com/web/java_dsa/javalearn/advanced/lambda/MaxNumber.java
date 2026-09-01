package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Max {
    int findMaxNumberOfTwoNumber(int a,int b);
}

public class MaxNumber {
    public static void main(String[] args) {
        // 6. Kattasini topish
        //
        //Ikki Integer qabul qilib, kattasini qaytaruvchi lambda yozing.
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.println("b=");
        int b = scanner.nextInt();

       // Max max = (x,y) -> a > b ? a : b; // first way
       // Max max = (x,y) -> Math.max(x,y); // second way
        Max max = Math::max; // third way
        System.out.println(max.findMaxNumberOfTwoNumber(a,b));
    }
}
