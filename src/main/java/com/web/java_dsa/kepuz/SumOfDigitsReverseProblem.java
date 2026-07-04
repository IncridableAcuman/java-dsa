package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class SumOfDigitsReverseProblem {
    public static int sumDigit(int n){
        int sum=0;
        while (n!=0){
            int r = n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0,i=0;
        while (true){
            if (sumDigit(i) == n){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
