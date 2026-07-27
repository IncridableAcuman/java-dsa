package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ParsingVaqt {
    public static void main(String[] args) {
        // https://kep.uz/problems/273
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] split = time.split(":");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (a>=12){
            System.out.println("P.M.");
        } else {
            System.out.println("A.M.");
        }
    }
}
