package com.web.java_dsa.javalearn.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinElementInList {
    public static void main(String[] args) {
        // Eng kichik elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        int minElement = list.get(0);
        for (int i : list){
            if (i < minElement){
                minElement = i;
            }
        }
        System.out.println(minElement);
    }
}
