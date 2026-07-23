package com.web.java_dsa.kepuz;

public class BirXilYigindiliSonlar {
    public static int sumDigit(int n){
        int s=0;
        while (n!=0){
            int r = n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 1000;
        int i=0,j=0;
        while (j<3){
            if (sumDigit(i)==19){
                String str = Integer.toString(i);
                if (str.charAt(0)=='3'){
                    System.out.println(i);
                    j++;
                }
            }
            i++;
        }
    }
}
