package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = n%10;
        int whole = n/10;
        System.out.println(mod*10+whole);
    }
}
