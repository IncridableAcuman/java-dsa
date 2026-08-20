package com.web.java_dsa.javalearn.dsa.collection;

// use
public class Main{
    public static void main(String[] args) {

        String[] languages = {"Java","Python","Go"};

        CustomFixedList<String> customFixedList = new CustomFixedList<>(languages);

        System.out.println("Size: " + customFixedList.size());
        System.out.println("Contains: " + customFixedList.contains("Java"));

        customFixedList.set(1,"Rust");

        for (String language : languages){
            System.out.print(language + " ");
        }
    }
}
