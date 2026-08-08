package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxElementInList {
    public static void main(String[] args) {
        // Eng katta elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            elements.add(k);
        }
        int maxElement = elements.get(0);
        for (int element : elements){
            if (element > maxElement){
                maxElement = element;
            }
        }
        System.out.println(maxElement);
    }
}
