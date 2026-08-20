package com.web.java_dsa.javalearn.dsa.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class NthElementFromEnd {
    public static void main(String[] args) {
        // Nth element from end.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<n;i++){
            int t = scanner.nextInt();
            list.add(t);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(k-1));
    }
}
