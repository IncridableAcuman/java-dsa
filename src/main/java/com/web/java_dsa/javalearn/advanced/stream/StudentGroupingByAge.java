package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroupingByAge {
    public static void main(String[] args) {
        // 18. Studentlarni yosh bo‘yicha guruhlash
        //class Student {
        //    String name;
        //    int age;
        //}
        //
        //Studentlar:
        //
        //Ali      20
        //Vali     21
        //Sardor   20
        //Izzatbek 22
        //Bob      21
        //
        //Collectors.groupingBy() yordamida studentlarni yosh bo‘yicha guruhlang.
        // 20 → [Ali, Sardor]
        //21 → [Vali, Bob]
        //22 → [Izzatbek]

        List<Student> students = new ArrayList<>();
        students.add(new Student("Izzatbek",22,85));
        students.add(new Student("Ismoil",21,95));
        students.add(new Student("Abror",22,70));
        students.add(new Student("Bahrom",19,90));
        students.add(new Student("Isobek",19,90));
        students.add(new Student("Bekzod",21,75));
        students.add(new Student("Saidbek",22,78));
        students.add(new Student("Fahriddin",22,60));
        students.add(new Student("Diyorbek",21,80));
        students.add(new Student("Shavkatbek",21,80));
        students.add(new Student("Shuhrat",23,72));
        students.add(new Student("Abbosbek",21,84));
        students.add(new Student("Polvonboy",21,76));
        students.add(new Student("Xudoybergan",21,75));
        students.add(new Student("Furqatbek",20,70));
        students.add(new Student("Zafarbek",22,65));
        students.add(new Student("Mahmudjon",21,67));
        students.add(new Student("Sa'natbek",21,65));
        students.add(new Student("Shonazar",23,85));
        students.add(new Student("Muhriddin",22,60));

        students
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getAge,
                        Collectors.mapping(Student::getName,Collectors.toList())
                )).forEach((age,name)-> System.out.println(age + "->" + name));
    }
}
