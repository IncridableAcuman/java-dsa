package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DecimalToBinary {
    public static String toBinary(int n){
        StringBuilder str= new StringBuilder();
        while (n>0){
            int r=n%2;
            str.append(r);
            n/=2;
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(toBinary(n));
    }
}
