package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Istisnolar2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/137
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            System.out.println(y==0 ? "inf" : x/y);
        } catch (RuntimeException e) {
            System.out.println("Wrong Format");
        }
    }
}
