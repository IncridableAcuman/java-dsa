package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeGroupingByDepartment {
    public static void main(String[] args) {
        //19. Employee'larni department bo‘yicha guruhlash
        //class Employee {
        //    String name;
        //    String department;
        //    double salary;
        //}
        //
        //Ma'lumot:
        //
        //Ali      IT       5000
        //Vali     HR       4000
        //Sardor   IT       7000
        //Bob      Finance  6000
        //Akmal    HR       4500
        //Izzatbek IT       8000
        //
        //Department bo‘yicha guruhlang.
        //
        //IT      → Ali, Sardor, Izzatbek
        //HR      → Vali, Akmal
        //Finance → Bob

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Izzatbek",22,5500,"IT"));
        employees.add(new Employee("Ismoil",21,5500,"Finance"));
        employees.add(new Employee("Ali",23,3000,"HR"));
        employees.add(new Employee("Abrorbek",22,5500,"Finance"));
        employees.add(new Employee("Sardor",24,4000,"HR"));


        employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toList()
                        ))).forEach((department,name)-> {
                            String joinedName = String.join(", ",name);
                    System.out.println(department + " -> " + joinedName);
                });

        System.out.println("--------------------Department bo'yicha nechta employee borligini aniqlash---------------------");

        // 🔴 6-bosqich — groupingBy() + boshqa Collector
        //20. Department bo‘yicha employee soni
        //
        //Yuqoridagi Employee'larni department bo‘yicha guruhlang va har bir department'da nechta employee borligini aniqlang.
        //
        //IT      → 3
        //HR      → 2
        //Finance → 1
        //
        //Bu yerda:
        //
        //groupingBy()
        //counting()
        //
        //birgalikda ishlatiladi.
        employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getDepartment,Collectors.counting())
                )).forEach((department,counting)-> System.out.println(department + " -> " + counting));

        System.out.println("-----------Department bo'yicha average ni hisoblash------------------------");

        // 21. Department bo‘yicha o‘rtacha salary
        //
        //Har bir department uchun o‘rtacha salaryni toping.
        //
        //IT      → 6666.67
        //HR      → 4250
        //Finance → 6000
        //
        //groupingBy() + averagingDouble() ishlating.
                employees
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                        .forEach((department,averaging)-> System.out.println(department + " -> " + averaging));


        System.out.println("---------Department bo'yicha eng katta salary----------------");
        // 22. Department bo‘yicha eng katta salary
        //
        //Har bir department'dagi eng katta salaryni toping.
        //
        //IT      → 8000
        //HR      → 4500
        //Finance → 6000

        employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                )).forEach((department,employee)-> System.out.println(department + " -> " + employee.map(Employee::getSalary).get()));

    }
}
