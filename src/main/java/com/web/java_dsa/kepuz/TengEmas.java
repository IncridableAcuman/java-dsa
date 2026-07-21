package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class TengEmas {
    public static void main(String[] args) {
        // https://kep.uz/problems/1680
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i=l;i<=r;i++){
            if (i!=n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
