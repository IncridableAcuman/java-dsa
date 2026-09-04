package com.web.java_dsa.javalearn.advanced.lambda;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }

    // 26. Employee bilan ishlash
    //
    //Quyidagi class mavjud:
    //
    //class Employee {
    //    private String name;
    //    private int age;
    //    private double salary;
    //}
    //
    //Employee'lar ro‘yxatidan:
    //
    //maoshi 5000 dan katta bo‘lganlarni toping;
    //yosh bo‘yicha sort qiling;
    //eng katta maoshni toping;
    //faqat employee nomlarini oling;
    //o‘rtacha maoshni hisoblang.

}
