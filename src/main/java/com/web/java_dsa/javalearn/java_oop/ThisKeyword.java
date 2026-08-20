package com.web.java_dsa.javalearn.java_oop;

public class ThisKeyword {
    /*int x = 5;
    public ThisKeyword(int x){
        this.x=x; // 1-vazifasi
    }*/

  /*  int modelYear;
    String modelName;
    public ThisKeyword(String modelName){
        this(2025,modelName);
    }
    public ThisKeyword(int modelYear,String modelName){
        this.modelYear=modelYear;
        this.modelName=modelName;
    }

    public void display(){
        System.out.println(modelYear + " " + modelName);
    } */ // 2-vazifasi

    int a = 5;
    int b = 10;

    public ThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {
        /*Javada this kalit so'zi joriy obyektga (current object)
         ishora qiluvchi maxsus ko'rsatkichdir.
         U asosiy uchta vazifani bajaradi: sinf maydonlari va metod parametrlari nomlari
         bir xil bo'lganda ularni farqlash, boshqa konstruktorni chaqirish va joriy obyektni
          argument sifatida uzatish.*/

        /*ThisKeyword thisKeyword1 = new ThisKeyword("Malibu");
        thisKeyword1.display();
        ThisKeyword thisKeyword2 = new ThisKeyword(2026,"Mersedez Benz");
        thisKeyword2.display();*/
    }
}
