package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUppercase {
    public static void main(String[] args) {
        // 23. String'larni uppercase qilish
        //["java", "spring", "docker", "postgresql"]
        //
        //Lambda + Stream yordamida:
        //
        //["JAVA", "SPRING", "DOCKER", "POSTGRESQL"]
        //
        //oling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            String element = scanner.next();
            list.add(element);
        }
        list
                .stream()
                .map(String::toUpperCase)
                .forEach(x-> System.out.print(x + " "));
    }
}
