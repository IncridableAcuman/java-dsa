package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class MasalalarReytingi {
    public static void main(String[] args) {
        /// https://kep.uz/problems/2229
        Scanner scanner = new Scanner(System.in);
        int oson = scanner.nextInt();
        int asos = scanner.nextInt();
        int normal = scanner.nextInt();
        int urtacha = scanner.nextInt();
        int ilgor = scanner.nextInt();
        int qiyin = scanner.nextInt();
        int judaQiyin = scanner.nextInt();

        int result = ( ( oson * 10 ) +  ( asos * 30 ) + ( normal *75 ) + ( urtacha * 200 ) + ( ilgor * 500 ) + ( qiyin * 3000 ) + ( judaQiyin * 50000 ) );
        System.out.println(result);
    }
}
