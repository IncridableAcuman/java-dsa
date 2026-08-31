package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class UylanganSon2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/564
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (5 * x - 50)/3;
        System.out.println(y > 0 ? y : -1);
    }
}
