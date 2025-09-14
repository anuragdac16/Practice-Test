package com.app.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {

        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "Alice", "IT", 60000),
                    new Employee(2, "Bob", "HR", 50000),
                    new Employee(3, "Charlie", "IT", 70000),
                    new Employee(4, "David", "HR", 40000),
                    new Employee(5, "Eve", "Finance", 80000),
                    new Employee(6, "Frank", "Finance", 90000)
            );

            List<Employee> emps = employees.stream().
                    sorted(Comparator.comparing(Employee::getDepartment).
                            //thenComparing(Employee::getName).
                            thenComparing(Employee::getSalary, Comparator.reverseOrder())).
                    toList();
            emps.forEach(System.out::println);
            // Step 1: Calculate the average salary for each department
            Map<String, Double> avgSalaryByDept = employees.stream()
                    .collect(Collectors.groupingBy(
                            Employee::getDepartment,
                            Collectors.averagingDouble(Employee::getSalary)
                    ));

            System.out.println("Average Salary by Department:");
            avgSalaryByDept.forEach((dept, avgSalary) ->
                    System.out.println(dept + ": " + avgSalary)
            );

            // Step 2: Find employees earning more than their department's average salary
            List<Employee> aboveAverageEmployees = employees.stream()
                    .filter(emp -> emp.getSalary() > avgSalaryByDept.get(emp.getDepartment()))
                    .collect(Collectors.toList());

            System.out.println("\nEmployees earning more than their department's average salary:");
            aboveAverageEmployees.forEach(System.out::println);
        }
    }



