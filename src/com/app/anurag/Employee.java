package com.app.anurag;

public class Employee {
    private int id;
    private String firstName;

    private String lastName;

    private Double salary;
    private String gender;

    public Employee(){

    }
    public Employee (int id, String firstName, String lastName ,Double sal, String gender){
        this.id  = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = sal;
        this.gender= gender;
    }
    public int getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String getEmpName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpName(String firstName) {
        this.firstName = firstName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
