package com.web.java_dsa.basic.java_oop;
/*
public class Main{
  /*  void printInfo(ThisKeyword keyword){
        keyword.a=20;
        keyword.b=25;
        System.out.println(keyword.a + " " + keyword.b);
    }}

 */
/*
public class Main extends Polymorphism{
    @Override
    public void printInfo() {
        super.printInfo();
        //System.out.println("My name is Izzatbek");
    }
    public Main(){
        super();
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        NestedClassFirst nestedClassFirst = new NestedClassFirst();
        NestedClassFirst.NestedClassLast nestedClassLast = nestedClassFirst.new NestedClassLast();
        nestedClassFirst.display();
        nestedClassLast.display();
    }
}*/

/* // 1-usul
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction() { // first way
            @Override
            void printInfo() {
                System.out.println("Hello Java Developer");
            }
        };
    }
}
*/
// 2-usul
/*
public class Main extends Abstraction{
    @Override
    void printInfo() {
        System.out.println("Hello Java Developer");
    }
    /*public void printInfo(){
        System.out.println("Hello Java Developer");
    }
}*/

public class Main implements Interface {

    @Override
    public void printString(String str) {
        System.out.println(str.toLowerCase());
    }

    @Override
    public void printInteger(int a) {
        System.out.println(a*2);
    }

    @Override
    public void printDouble(double a) {
        System.out.println(Math.ceil(a));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printDouble(2.3);
        main.printInteger(2);
        main.printString("HELLO JAVA DEVELOPER");
    }
}