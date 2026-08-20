package com.web.java_dsa.javalearn.dsa.list_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        // String sort.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            String word = scanner.next();
            list.add(word);
        }
        Collections.sort(list);
        for (String word : list){
            System.out.print(word + " ");
        }
        scanner.close();
    }
}
