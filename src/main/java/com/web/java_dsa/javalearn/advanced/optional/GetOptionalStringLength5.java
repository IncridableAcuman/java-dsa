package com.web.java_dsa.javalearn.advanced.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class GetOptionalStringLength5 {
    public static void main(String[] args) {
        // 7. Optional<String> berilgan. Faqat uzunligi 5 dan katta bo‘lgan Stringni qabul qiling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-user=");
            String k = scanner.next();
            list.add(k);
        }
        Optional<String> optional = list
                .stream()
                .filter(s -> s.length() > 5)
                .findFirst();
        System.out.println(optional.orElse("Unknown"));
    }
}
