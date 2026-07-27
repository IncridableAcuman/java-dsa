package com.web.java_dsa.kepuz;


import java.util.Scanner;

public class ParsingSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/274
        Scanner scanner = new Scanner(System.in);
        String sana = scanner.next();
        String[] split = sana.split("\\.");

        System.out.println(split[2]+"/"+split[1]+"/"+split[0]);
    }
}
