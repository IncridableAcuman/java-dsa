package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateElementsInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            elements.add(k);
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>(new ArrayList<>(elements));
        for (int element:set){
            System.out.print(element + " ");
        }
    }
}
