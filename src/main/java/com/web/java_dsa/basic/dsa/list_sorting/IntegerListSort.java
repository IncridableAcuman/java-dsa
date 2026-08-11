package com.web.java_dsa.basic.dsa.list_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntegerListSort {
    public static void main(String[] args) {
        // Integer List sort.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Collections.sort(list);
        for (int x : list){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
