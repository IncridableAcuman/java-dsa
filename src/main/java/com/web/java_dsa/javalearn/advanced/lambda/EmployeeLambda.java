package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class EmployeeLambda {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Izzatbek",22,5500));
        employees.add(new Employee("Ismoil",21,5500));
        employees.add(new Employee("Ali",23,3000));
        employees.add(new Employee("Abrorbek",22,5500));
        employees.add(new Employee("Sardor",24,4000));

        /* // maoshi 5000 dan katta bo‘lganlarni toping;
        // salary grater than 5000
        List<Employee> employeeList = employees
                .stream()
                .filter(employee -> employee.getSalary() > 5000)
                .toList();

        employeeList
                .forEach(System.out::println);*/

        /*
        // yosh bo‘yicha sort qiling;
        List<Employee> sortedEmployeesViaAge = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed()).toList();

        sortedEmployeesViaAge
                .forEach(System.out::println);

         */
        /*
        // eng katta maoshni toping;
       Optional<Employee> employee = employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary));

        System.out.println(employee.get());
         */

        /*
        // faqat employee nomlarini oling;
        employees
                .stream()
                .map(Employee::getName)
                .forEach(System.out::println);

         */
        // o‘rtacha maoshni hisoblang.
        OptionalDouble average = employees
                .stream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average();
        System.out.println(average.getAsDouble());
    }
}
