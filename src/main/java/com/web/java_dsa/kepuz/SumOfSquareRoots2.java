package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class SumOfSquareRoots2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum=0;
        int i = 1;

        while ((long) i *i<=n){
            long start = (long) i *i;
            long end = Math.min(n, (long) (i + 1) *(i+1)-1);
            long count = end - start + 1;

            sum +=count*i;
            i++;
        }
        System.out.println(sum);
    }
}
