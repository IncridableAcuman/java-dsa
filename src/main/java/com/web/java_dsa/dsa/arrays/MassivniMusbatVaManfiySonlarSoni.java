package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivniMusbatVaManfiySonlarSoni {
    public static void main(String[] args) {
//        Massivdagi musbat va manfiy sonlar sonini aniqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int musbatSonlarSoni = 0;
        int manfiySonlarSoni = 0;
        String string ="1010";
        for (int i=0;i<n;i++){
            if (arr[i] >= 0){
                musbatSonlarSoni++;
            }
            if (arr[i] < 0){
               manfiySonlarSoni++;
            }
        }
        System.out.println("Musbat sonlar soni: " + musbatSonlarSoni + "\n" + "Manfiy sonlar soni: " + manfiySonlarSoni);
    }
}
