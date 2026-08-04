package com.web.java_dsa.basic.java_oop;

public class NonAccessModifiers {
    // Non-Access Modifiers
    /*
    1. static keyword - method yoki o'zgaruvchini o'z nomi bilan chaqirilishini ta'minlaydi.Obyekt yaratmasdan turib.
    2.  final keyword o'zgaruvchini o'zgarmas qiladi va method override qilishni cheklaydi,classdan voris olishni cheklaydi.
    3. abstract keyword - Abstractlikni ta'minlaydi.Obyekt yaratib bo'lmaydigan klasslar yoki tanasi yo'q methodlar
    uchun ishlatiladi.Faqat abstract classlarda bo'ladi.

    * */
    public static int add(int a,int b){
        return a + b;
    } // obyekt orqali emas balki o'z nomi bilan chaqirilishini taminlaydi.
  //  public abstract void display(){}
    final int x = 24;
    public static void main(String[] args) {
        NonAccessModifiers modifiers = new NonAccessModifiers();
      //  modifiers.x=23; // error
    }
}
