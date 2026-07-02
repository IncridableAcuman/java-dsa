package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class FourAndSixOrFife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if ((i%12==0) || i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
