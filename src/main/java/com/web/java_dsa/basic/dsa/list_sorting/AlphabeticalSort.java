package com.web.java_dsa.basic.dsa.list_sorting;

import java.util.*;

public class AlphabeticalSort {
    public static void main(String[] args) {
        // Alphabetical sort.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            String word = scanner.next();
            list.add(word);
        }
        Collections.sort(list);
        for (String x : list){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
