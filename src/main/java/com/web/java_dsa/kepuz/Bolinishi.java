package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Bolinishi {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(((a%3==0 && a%4==0)|| (a%5!=0)) ? "Yes" : "No");
    }
}
