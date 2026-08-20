package com.web.java_dsa.javalearn.dsa.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementToList {
    public static void main(String[] args) {
        // List ga 10 ta son qo'shing.
        Integer[] elements = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = new ArrayList<>(Arrays.asList(elements));
        for (int element : list){
            System.out.print(element);
        }
    }
}
