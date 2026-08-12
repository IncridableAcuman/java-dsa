package com.web.java_dsa.basic.dsa.hash_set;

import java.util.HashSet;

public class AddRandomElement {
    public static void main(String[] args) {
        // Random element qo'shish.
        HashSet<Integer> set = new HashSet<>();
        int x = Math.toIntExact(Math.round(Math.random() * 10));
        set.add(x);
        System.out.println(x);
    }
}
