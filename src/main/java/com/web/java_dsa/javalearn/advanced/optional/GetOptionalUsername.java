package com.web.java_dsa.javalearn.advanced.optional;

import java.util.*;

public class GetOptionalUsername {
    public static void main(String[] args) {
        // 4. Optional<String> ichidan foydalanuvchi nomini oling. Agar mavjud bo‘lmasa "Unknown" qaytaring.

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
                .findAny();
        System.out.println(optional.orElse("Unknown"));
    }
}
