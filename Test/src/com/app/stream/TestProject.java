package com.app.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestProject {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "ABC", Arrays.asList(
                        new Subject("English", 70),
                        new Subject("Hindi", 65),
                        new Subject("Math", 80))),
                new Student(2, "DEF", Arrays.asList(
                        new Subject("English", 60),
                        new Subject("Hindi", 50),
                        new Subject("Math", 40))),
                new Student(3, "GHI", Arrays.asList(
                        new Subject("English", 80),
                        new Subject("Hindi", 85),
                        new Subject("Math", 90)
                )));

        students.stream().map(stu -> stu.getSubjects().stream().collect(Collectors.averagingDouble(Subject::getMarks))).forEach(System.out::println);

        students.stream().forEach(stu -> {
            double marks =  stu.getSubjects().stream().collect(Collectors.averagingDouble(Subject::getMarks));
            System.out.println(stu.getStudentId() + " : " + marks);
        });

        students.stream().map(stu -> "Student ID: " + stu.getStudentId() + ", Average Marks: " +
                stu.getSubjects().stream().collect(Collectors.averagingDouble(Subject::getMarks))).forEach(System.out::println);


        students.stream()
                .map(stu -> String.format("Student ID: %d, Average Marks: %.2f", stu.getStudentId(), stu.getSubjects().stream().collect(Collectors.averagingDouble(Subject::getMarks))))
                .forEach(System.out::println);


    }
}
