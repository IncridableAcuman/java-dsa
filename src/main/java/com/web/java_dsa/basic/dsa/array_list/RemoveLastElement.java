package com.web.java_dsa.basic.dsa.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveLastElement {
    public static void main(String[] args) {
        // Oxiridan element o'chiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list.remove(list.get(list.size() - 1));
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
/*
5
1 2 3 4 5
1 2 3 4
*/