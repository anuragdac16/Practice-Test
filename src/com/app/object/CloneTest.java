package com.app.object;

public class CloneTest {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Anurag", "IT", 20000.00);

        Employee emp1 = emp.clone();

        emp.setSalary(30000.00);

        System.out.println(emp.getSalary());
        System.out.println(emp1.getSalary());
    }
}
