package com.web.java_dsa.basic.java_oop;

public class Anonymous {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction() {
            @Override
            void printInfo() {
                System.out.println("Hello java developer");
            }
        };
        abstraction.printInfo();
    }
}
//  anonim class bu - bir vaqting o'zida elon qilib,shu vaqt obyekti yaratiladigan ichki class
// u alohida class so'zi yozmasdan mavjud class yoki interface metodlarini bir martalik
// override qilish uchun ishlatiladi.