package com.web.java_dsa.javalearn.math;

import java.util.Scanner;

public class KvadratYuzasi {
    public static void main(String[] args) {
        // Begin2. Kvadratning tomoni a berilgan. Uning yuzasi aniqlansin.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       // int S = Math.pow(a,2);
        int S = a * a;
        System.out.println(S);
    }
}
