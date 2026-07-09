package com.web.java_dsa.oop;

public class JavaConstructor {
/*    int x;
    public JavaConstructor(){
        x=5;
    }*/
    int x,y;
    public JavaConstructor(int y){
        x=y;
    }
    public JavaConstructor(int a,int b){
        x=a;
        y=b;
    }

    public static void main(String[] args) {
        JavaConstructor constructor = new JavaConstructor(10,5);
        System.out.println(constructor.x);
        System.out.println(constructor.x+"---"+constructor.y);
        /*
        * 10
          10---5
        * */

    }
}
