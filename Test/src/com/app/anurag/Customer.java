package com.app.anurag;

import java.util.HashSet;
class Customer {

    String name;

    int age;

    Customer(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {

        Customer c1= new Customer("John",20);

        Customer c2= new Customer("John",20);

        HashSet<Customer> customerSet=new HashSet<>();

        customerSet.add(c1);

        customerSet.add(c2);

        System.out.println(customerSet.size());

        String a = "12";
        String b = "12";
        System.out.println(a==b);

    }

}
