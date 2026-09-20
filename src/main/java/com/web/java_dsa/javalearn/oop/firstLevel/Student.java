package com.web.java_dsa.javalearn.oop.firstLevel;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String department;
    private final double GPA;

    public Student(String firstName,String lastName,int age,String department,double GPA){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.department=department;
        this.GPA=GPA;
    }
    public String display(){
        return("|-------------------- STUDENT --------------------|" + "\nFirstname: " + firstName
        + "\nLastname: " + lastName + "\nAge: " + age + "\nDepartment: " + department + "\nGPA: " + GPA);
    }

    public static void main(String[] args) {
        // 2. Student
        //
        //Student klassini yarating.
        //
        //Student:
        //
        //ism
        //familiya
        //yosh
        //fakultet
        //GPA
        //
        //Talaba haqida ma'lumot chiqaruvchi metod yarating.

    }
}
