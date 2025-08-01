package com.app.hash;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int departmentId;


    public Employee() {
    }

    public Employee(int empId, String empName, double salary, int departmentId) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.departmentId = departmentId;
    }
//
//    @Override
//    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (!(o instanceof Employee)) return false;
////        Employee employee = (Employee) o;
////        return getEmpId() == employee.getEmpId() && Double.compare(getSalary(), employee.getSalary()) == 0 && getDepartmentId() == employee.getDepartmentId() && Objects.equals(getEmpName(), employee.getEmpName());
//
//        return true;
//    }

    @Override
    public int hashCode() {
        return 1;
//        return Objects.hash(getEmpId(), getEmpName(), getSalary(), getDepartmentId());
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }

    private static void testPrivate (){
        System.out.println("Inside static  test Method");
    }
    private  void testPrivate1 (){
        System.out.println("Inside Non static  test Method");
    }
}
