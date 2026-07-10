package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DivisibleByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a%2==0 && b%2==0){
            System.out.println(2);
        }
        else if (a%2==0 || b%2==0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
