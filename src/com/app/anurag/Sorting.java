package com.app.anurag;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Anurag", "Gupta", 100.00, "Male"),
                new Employee(2, "Anurag","Singh", 200.00, "Female"),
                new Employee(3, "Adhidsh", "Gupta", 300.00, "Male"),
                new Employee(4, "Ananya", "Singh", 100.00, "Female")
        );


        employees.stream().
                sorted(Comparator.comparing(Employee::getEmpName)
                        .thenComparing(Employee::getLastName))
                .forEach(System.out::println);
    }
}
