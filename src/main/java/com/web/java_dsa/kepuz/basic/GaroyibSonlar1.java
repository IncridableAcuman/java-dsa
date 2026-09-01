package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class GaroyibSonlar1 {
    public static int sumDigit(int n){
        int sum=0;
        while (n!=0){
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/1155
        Scanner scanner = new Scanner(System.in);
        int count=0;
        for (int i=100000;i<=999999;i++){
            int x = i / 1000;
            int y = i % 1000;
            if (sumDigit(x) > sumDigit(y)){
                count++;
            }
        }
        System.out.println(count);
    }
}
