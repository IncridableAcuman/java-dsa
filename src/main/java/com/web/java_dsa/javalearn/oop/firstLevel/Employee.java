package com.web.java_dsa.javalearn.oop.firstLevel;

public class Employee {
    private final int id;
    private final String fullName;
    private double salary;
    private final String position;

    public Employee(int id,String fullName,double salary,String position){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
        this.position=position;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }
    public String  increaseSalary(double percent){
        if (percent > 0){
            double raiseAmount = salary * (percent/100.0);
            salary += raiseAmount;
            return "Increased salary by: " + percent + "%, Current salary: " + salary;
        }
        return "The percent must be greater than zero.";
    }

    @Override
    public String toString(){
        return "Employee={" + "id=" + id +
                             ", fullName='" + fullName + '\'' +
                             ", position='" + position + '\'' +
                             ", salary=" + salary +
                "}";
    }

    public static void main(String[] args) {
        // 5. Employee
        //
        //Employee klassini yarating.
        //
        //id
        //fullName
        //salary
        //position
        //
        //Metod:
        //
        //increaseSalary(percent)
    }
}
