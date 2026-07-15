package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Zarik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==1){
            System.out.println(6);
        } else if (a==6) {
            System.out.println(1);
        } else if (a==4) {
            System.out.println(3);
        } else if (a==3) {
            System.out.println(4);
        } else if (a==5){
            System.out.println(2);
        } else if (a==2){
            System.out.println(5);
        }
    }
}
