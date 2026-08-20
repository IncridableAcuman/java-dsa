package com.web.java_dsa.javalearn.java_oop;

public class NestedClassFirst {
    int x = 5;
    public void display(){
        System.out.println("Nested class root");
    }

    public  class NestedClassLast{
        int y = 10;

        public void display(){
            System.out.println("Nested class last");
        }
    }
    private class NestedClassThird{
        int z = 15;
    }
}
