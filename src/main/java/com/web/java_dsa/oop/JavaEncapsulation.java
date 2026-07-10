package com.web.java_dsa.oop;

public class JavaEncapsulation {
    private String fullName;
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public static void main(String[] args) {
        JavaEncapsulation encapsulation = new JavaEncapsulation();
        encapsulation.setFullName("Izzatbek Abdusharipov");
        System.out.println(encapsulation.getFullName());
        // Class da fieldlarga to'g'ridan to'g'ri murojat qilishni imkoni yo'q buning uchun
        // maxsus getter,setter methodlaridan foydalaniladi.Bu kodni xavfsizligni taminlaydi.
    }
}
