package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Concat {
    String concatination(String x,String y);
}

public class ConcatTwoString {
    public static void main(String[] args) {
        // 8. Ikki String'ni birlashtirish
        //
        //Ikki String qabul qilib, ularni bo‘sh joy bilan birlashtiruvchi lambda yozing.

        Scanner scanner = new Scanner(System.in);
        System.out.print("First str: ");
        String a = scanner.next();
        System.out.print("Second str: ");
        String b = scanner.next();

        Concat concat = String::concat;
        System.out.println(concat.concatination(a,b));
    }
}
