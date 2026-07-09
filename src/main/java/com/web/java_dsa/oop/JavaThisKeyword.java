package com.web.java_dsa.oop;

public class JavaThisKeyword {
    int a;
    int b;
    /*public JavaThisKeyword(int a,int b){
        this.a=a; // 10
        this.b = b; // 20,

    }*/
    public JavaThisKeyword(int x){
        this(x,20);
    }
    public JavaThisKeyword(int x,int y){
        this.a=x;
        this.b=y;
    }
    public void display(){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        JavaThisKeyword keyword = new JavaThisKeyword(10);
        keyword.display();
        JavaThisKeyword thisKeyword = new JavaThisKeyword(5,6);
        thisKeyword.display();
    }
}

