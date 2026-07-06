package com.web.java_dsa.kepuz;


import java.util.Scanner;

public class FirstOneSecondTwoThreeElementIndex {
    public static int first(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            if(count==1){
                return i+1;
            }
        }
        return -1;
    }
    public static int second(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                count++;
            }
            if(count==2){
                return i+1;
            }
        }
        return -1;
    }
    public static int third(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3){
                count++;
            }
            if(count==3){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int a = first(arr);
        int b = second(arr);
        int c = third(arr);
        System.out.println(a+" "+b+" "+c);
    }
}
