package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamMap {
    public static void main(String[] args) {
        // 22. map()
        //
        //Quyidagi sonlarni ularning kvadratlariga aylantiring:
        //
        //[2, 3, 4, 5, 6]
        //
        //Natija:
        //
        //[4, 9, 16, 25, 36]
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .map((x)-> x * x)
                .forEach((x)-> System.out.print(x + " "));
    }
}
