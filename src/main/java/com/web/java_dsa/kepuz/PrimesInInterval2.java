package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class PrimesInInterval2 {
    public static boolean primesInInterval(int n){
        if (n<2) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6){
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int count=0;
        for (int i = L;i<=R;i++){
            if (primesInInterval(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
