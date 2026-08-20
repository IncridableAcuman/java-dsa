package com.web.java_dsa.javalearn.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PairElementsFromCollection {
    public static void main(String[] args) {
        // Collection ichidagi juft sonlarni ajratish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<Integer> collection = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            collection.add(element);
        }
        for (int element : collection){
            if (element %2 == 0){
                System.out.print(element + " ");
            }
        }
    }
}
