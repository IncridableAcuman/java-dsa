package com.web.java_dsa.kepuz;

public class FourthDigitNumber {
    public static int sumDigit(int n){
        int sum = 0;
        while (n!=0){
            int res = n%10;
            sum +=res;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int start = 1000,end = 9999;
        for (int i = start;i <= end; i++){
            if (sumDigit(i) %2 ==0){
                System.out.print(i+" ");
            }
        }
    }
}
