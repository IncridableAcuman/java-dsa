package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class LinearSearchFourth {
    public static int findElementIndex(int[] arr,int whichElement,int index){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==whichElement){
                count++;
            }
            if (count==index){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=scanner.nextInt();
        }
        int first = findElementIndex(arr,1,1);
        int second = findElementIndex(arr,2,2);
        int third = findElementIndex(arr,3,3);
        int fourth = findElementIndex(arr,4,4);
        int five = findElementIndex(arr,5,5);
        int sixth = findElementIndex(arr,6,6);
        int seventh = findElementIndex(arr,7,7);
        int eight = findElementIndex(arr,8,8);
        int nine = findElementIndex(arr,9,9);
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+five+" "+sixth+" "+seventh+" "+eight+" "+nine);
    }
}
