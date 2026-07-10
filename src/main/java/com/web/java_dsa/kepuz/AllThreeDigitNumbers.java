package com.web.java_dsa.kepuz;

public class AllThreeDigitNumbers {
    public static int sumDigit(int n){
        int sum=0;
        while (n!=0){
            int r = n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public static int multiplicationOfNumbers(int n){
        int p=1;
        while (n!=0){
            int r = n%10;
            p*=r;
            n/=10;
        }
        return p;
    }
    public static void main(String[] args) {
        int start=100,end=999;
        System.out.println(multiplicationOfNumbers(123));
    }
}
