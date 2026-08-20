package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;


public class ClearArrayList {
    public static void main(String[] args) {
        // ArrayList ni tozalang.
        int[] numbers = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers){
            list.add(number);
        }
        list.clear();
    }
}
