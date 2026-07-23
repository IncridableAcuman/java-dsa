package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KvadratYigindi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum1=0;
        int sum2=0;
        for (long i=1;i<=n;i++){
            sum1+=(i*i);
        }
        for (long i=1;i<=n;i++){
            sum2+=i;
        }
        System.out.println(Math.abs((sum2*sum2)-sum1));
    }
}
