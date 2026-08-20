package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomShuffle {
    public static void main(String[] args) {
        // Elementlarni random shuffle qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Random random = new Random();
        Collections.shuffle(list,random);
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
