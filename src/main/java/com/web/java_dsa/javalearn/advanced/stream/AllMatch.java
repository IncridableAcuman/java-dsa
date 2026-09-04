package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        // 8. allMatch()
        //
        //Studentlar:
        //
        //List<Integer> scores =
        //        List.of(75, 82, 91, 68, 88);
        //
        //Barcha studentlar 50 balldan yuqori olganmi?

        List<Student> students = new ArrayList<>();
        students.add(new Student("Izzatbek",22,85));
        students.add(new Student("Ismoil",21,95));
        students.add(new Student("Abror",22,70));
        students.add(new Student("Bahrom",19,90));
        students.add(new Student("Isobek",19,90));
        students.add(new Student("Bekzod",21,75));
        students.add(new Student("Saidbek",22,78));
        students.add(new Student("Fahriddin",22,60));

        boolean isExist = students
                .stream()
                .allMatch(student -> student.getScore() >= 60);
        System.out.println(isExist ? "Yes" : "No");
    }
}
