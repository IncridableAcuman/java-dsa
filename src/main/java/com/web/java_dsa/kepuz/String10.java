package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        // https://kep.uz/problems/396
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String res = str.replace("Python","CPython");
        System.out.println(res);
    }
}
