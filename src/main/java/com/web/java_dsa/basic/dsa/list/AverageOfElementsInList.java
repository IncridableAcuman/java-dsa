package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfElementsInList {
    public static void main(String[] args) {
        // List ichidagi o'rtacha qiymatni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int element = scanner.nextInt();
            elements.add(element);
        }
        int sum=0;
        for (int element : elements){
            sum +=element;
        }
        int average = sum / n;

        System.out.println(average);
    }
}
