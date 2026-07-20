package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ValyutaKursi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valyuta = scanner.next();
        int a = scanner.nextInt();
        if (valyuta.contains("yevro")){
            System.out.println(a*12000);
        } else if (valyuta.contains("dollar")) {
            System.out.println(a*11000);
        } else {
            System.out.println(a*180);
        }
    }
}
