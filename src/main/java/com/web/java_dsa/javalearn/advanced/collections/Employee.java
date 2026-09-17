package com.web.java_dsa.javalearn.advanced.collections;

public class Employee {
    private String name;
    private String job;
    private String company;
    private double salary;

    public Employee(String name,String job,String company,double salary){
        this.name=name;
        this.job=job;
        this.company=company;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString(){
        return "Employee= " + name + " Company= " + company + " Job= " + job +
                " Salary= " + salary;
    }
}
