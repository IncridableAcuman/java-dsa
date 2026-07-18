package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DarajaniIshorasiFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str = String.valueOf(Math.pow(a,b));
        if (str.contains("-")){
            System.out.println("-");
        } else {
            System.out.println("+");
        }
    }
}
