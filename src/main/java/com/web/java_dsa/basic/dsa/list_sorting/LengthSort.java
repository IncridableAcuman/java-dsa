package com.web.java_dsa.basic.dsa.list_sorting;

import java.util.*;

public class LengthSort {
    public static void main(String[] args) {
        // Length bo'yicha sort.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            String word = scanner.next();
            list.add(word);
        }
        list.sort(Comparator.comparingInt(String::length));
        for (String x : list){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
