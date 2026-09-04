package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {

        // 7. anyMatch()
        //
        //Studentlar:
        //
        //List<Integer> scores =
        //        List.of(45, 67, 82, 91, 56);
        //
        //Hech bo‘lmaganda 90 yoki undan yuqori ball olgan student bormi?

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
                .anyMatch(student -> student.getScore() >=90);
        System.out.println(isExist ? "Yes" : "No");
    }
}
