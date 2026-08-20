package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class CloneArrayList {
    public static void main(String[] args) {
        // ArrayList clone qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Object clone = list.clone();
        System.out.println(clone);
    }
}
