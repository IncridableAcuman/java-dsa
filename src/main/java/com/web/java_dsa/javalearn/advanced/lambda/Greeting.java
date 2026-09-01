package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Greet {
    String greeting(String name);
}

public class Greeting {
    public static void main(String[] args) {
        // 3. Son juft yoki toqligini aniqlash
        //
        //Son qabul qilib, true/false qaytaruvchi lambda yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        Greet greet = ism-> "H i" + ism;
        System.out.println(greet.greeting(name));
    }
}
