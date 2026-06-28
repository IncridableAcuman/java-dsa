package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Scanner;

public class JuftToqlargaAjratish {
    public static void main(String[] args) {
//Juft va toq sonlarni alohida joylashtiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] res = new int[n];
        int left=0,right=arr.length-1;

        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                res[left]=arr[i];
                left++;
            }else {
                res[right]=arr[i];
                right--;
            }
        }

        for (Integer integer:res){
            System.out.print(integer+" ");
        }
    }
}
