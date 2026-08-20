package com.web.java_dsa.javalearn.java_oop;

public class JavaConstructor {
    int x = 5;

   /* public JavaConstructor(){
        System.out.println("Java Developer");
    }*/

   /* public JavaConstructor(){
        this.x=10;
    }*/
    public JavaConstructor(int y){
        this.x=y;
    }

    public static void main(String[] args) {
        //JavaConstructor constructor = new JavaConstructor(); // Java Developer
        /*
        JavaConstructor constructor = new JavaConstructor();
        System.out.println(constructor.x);// 5

         */
        JavaConstructor constructor = new JavaConstructor(20);
        System.out.println(constructor.x); // 20
    }
}
