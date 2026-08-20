package com.web.java_dsa.javalearn.java_oop;

public class ClassesObjects { // class
    int x = 5; // attributes
    double y = 3.4;
    float z = 0.4f;
    char t = 'a';
    byte a=5;

    int b;

    public static void main(String[] args) {
        ClassesObjects classesObjects = new ClassesObjects(); // object
        System.out.println(classesObjects.x); // 5
        classesObjects.b=10;
        System.out.println(classesObjects.b); // 10
    }
}
