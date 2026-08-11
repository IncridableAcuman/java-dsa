package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        // Difference.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> first = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            first.add(k);
        }
        int m = scanner.nextInt();
        ArrayList<Integer> second = new ArrayList<>();
        for (int i=0;i<m;i++){
            int k = scanner.nextInt();
            second.add(k);
        }
        for (int x : first){
            if (!second.contains(x)){
                System.out.println(x + " ");
            }
        }
        scanner.close();
    }
}
