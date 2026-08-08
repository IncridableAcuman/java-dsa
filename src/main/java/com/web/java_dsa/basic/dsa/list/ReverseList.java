package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        // List teskari chiqarilsin.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Collections.reverse(list);
        for (int i:list){
            System.out.print(i + " ");
        }
    }
}
