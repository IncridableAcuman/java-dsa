package com.web.java_dsa.javalearn.advanced.collections;

import java.util.*;

public class EmployeeSortWithNameByTreeMap {
    public static void main(String[] args) {
        // 39. TreeMap yordamida employee'larni ism bo‘yicha tartiblang.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Izzatbek", "Software Engineer", "Google", 1000000));
        employees.add(new Employee("Ali", "Product Manager", "Meta", 500000));
        employees.add(new Employee("Vali", "Data Scientist", "Amazon", 600000));
        employees.add(new Employee("Bekzod", "Frontend Developer", "Apple", 750000));
        employees.add(new Employee("Jasur", "Backend Developer", "Netflix", 820000));
        employees.add(new Employee("Sardor", "DevOps Engineer", "Microsoft", 700000));
        employees.add(new Employee("Timur", "UI/UX Designer", "Adobe", 450000));
        employees.add(new Employee("Madina", "QA Engineer", "Tesla", 480000));
        employees.add(new Employee("Zarina", "System Architect", "Google", 1200000));
        employees.add(new Employee("Aziz", "Security Engineer", "Apple", 900000));
        employees.add(new Employee("Sanjar", "Full Stack Developer", "Uber", 650000));
        employees.add(new Employee("Bobur", "Mobile Developer", "Spotify", 550000));
        employees.add(new Employee("Diyor", "Cloud Engineer", "Amazon", 780000));
        employees.add(new Employee("Kamola", "Business Analyst", "Meta", 520000));
        employees.add(new Employee("Nodir", "Machine Learning Eng", "OpenAI", 1500000));
        employees.add(new Employee("Otabek", "Database Admin", "Oracle", 620000));
        employees.add(new Employee("Shaxzod", "Network Engineer", "Cisco", 490000));
        employees.add(new Employee("Gulnora", "Scrum Master", "IBM", 580000));
        employees.add(new Employee("Javohir", "Support Engineer", "Intel", 400000));
        employees.add(new Employee("Farhod", "Engineering Manager", "Google", 1400000));

        TreeMap<String,List<Employee>> map = new TreeMap<>();
        for (Employee employee : employees){
            map.computeIfAbsent(employee.getName(),k-> new ArrayList<>()).add(employee);
        }
        map
                .forEach((name,empList)-> System.out.println(name + "=>" + empList));
    }
}
