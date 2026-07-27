package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Parsing3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sana = scanner.next();
        String[] split = sana.trim().split("\\.");
        int y = Integer.parseInt(split[0]);
        if (y<=7){
            System.out.println(1);
        } else if (y<=14) {
            System.out.println(2);
        } else if (y<=21) {
            System.out.println(3);
        } else if (y<=28){
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}
