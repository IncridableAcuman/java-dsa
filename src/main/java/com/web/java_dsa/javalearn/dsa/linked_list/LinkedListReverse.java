package com.web.java_dsa.javalearn.dsa.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListReverse {
    public static void main(String[] args) {
        // LinkedList ni reverse qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Collections.reverse(list);
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
