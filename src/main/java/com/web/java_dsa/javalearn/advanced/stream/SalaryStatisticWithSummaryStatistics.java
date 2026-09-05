package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Employee;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class SalaryStatisticWithSummaryStatistics {
    public static void main(String[] args) {
        // 🔥 10-bosqich — summaryStatistics()
        //29. Salary statistikasi
        //
        //Employee salary'lari:
        //
        //3000
        //4500
        //5000
        //7000
        //8500
        //
        //summaryStatistics() yordamida bir vaqtning o‘zida:
        //
        //minimum
        //maximum
        //average
        //count
        //sum
        //
        //ni toping.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Izzatbek",22,5500,"IT"));
        employees.add(new Employee("Ismoil",21,5500,"Finance"));
        employees.add(new Employee("Ali",23,3000,"HR"));
        employees.add(new Employee("Abrorbek",22,5500,"Finance"));
        employees.add(new Employee("Sardor",24,4000,"HR"));

        DoubleSummaryStatistics summaryStatistics = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();

        System.out.println("min: " + summaryStatistics.getMin());
        System.out.println("max: " + summaryStatistics.getMax());
        System.out.println("sum: " + summaryStatistics.getSum());
        System.out.println("count: " + summaryStatistics.getCount());
        System.out.println("average: " + summaryStatistics.getAverage());
        System.out.println(summaryStatistics);
    }
}
