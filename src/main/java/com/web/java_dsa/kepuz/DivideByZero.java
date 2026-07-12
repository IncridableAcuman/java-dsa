package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b==0){
            System.out.println("inf");
        } else {
            System.out.println(a/b);
        }
    }
}
