package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NumberAndDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();
        int raqam = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(son).append(raqam);
        System.out.println(builder.toString());
    }
}
