package com.app.hash;

import java.util.HashMap;
import java.util.Map;

public class HashGet {

    public static void main(String[] args) {
        HashMap<Employee, Integer> map = new HashMap<>();
        Employee e = new Employee(1, "Anurag", 1000.00, 11);
        map.put(e, 11);
        map.put(new Employee(2, "Gupta", 2000.00, 12), 12);
        map.put(new Employee(3, "John", 3000.00, 13), 13);
        map.put(new Employee(4, "jacob", 4000.00, 14), 14);
        map.put(new Employee(5, "rahul", 5000.00, 15), 15);


        int value = map.get(e);
        System.out.println(value);
    }
}
