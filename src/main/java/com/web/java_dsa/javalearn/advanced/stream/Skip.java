package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skip {
    public static void main(String[] args) {
        // 12. skip()
        //
        //Yuqoridagi List'dan dastlabki 3 ta elementni tashlab, qolganlarini oling.
        //
        //Output:
        //[40, 50, 60, 70]
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .skip(3)
                .forEach(x-> System.out.print(x + " "));
    }
}
