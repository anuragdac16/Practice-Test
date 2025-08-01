package com.app.hash;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class HashingProblem {


    public static void main(String[] args) {

        try {
            Employee e = new Employee();
            Class<?> obj =  Class.forName("com.app.hash.Employee");
            Method[] methods = obj.getDeclaredMethods();

            Method m = obj.getDeclaredMethod("testPrivate");
            m.setAccessible(true);
            m.invoke(Employee.class);

            Method m1 = obj.getDeclaredMethod("testPrivate1");
            m1.setAccessible(true);
            m1.invoke(e);

            for(Method method : methods){
//                method.setAccessible(true);
//                method.invoke(Employee.class);
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1, "Anurag", 1000.00, 11), 11);
        map.put(new Employee(2, "Gupta", 2000.00, 12), 12);
        map.put(new Employee(3, "John", 3000.00, 13), 13);
        map.put(new Employee(4, "jacob", 4000.00, 14), 14);
        map.put(new Employee(5, "rahul", 5000.00, 15), 15);


        System.out.println(map.size());


    }
}
