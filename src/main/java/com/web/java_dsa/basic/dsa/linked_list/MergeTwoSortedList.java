package com.web.java_dsa.basic.dsa.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        // Merge two sorted list.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> first = new LinkedList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            first.add(k);
        }
        Collections.sort(first);
        int m = scanner.nextInt();
        LinkedList<Integer> second = new LinkedList<>();
        for (int i=0;i<m;i++){
            int t = scanner.nextInt();
            second.add(t);
        }
        Collections.sort(second);
        second.addAll(first);
        Collections.sort(second);
        for (int y : second){
            System.out.print(y + " ");
        }
    }
}
