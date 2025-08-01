package com.app.anurag;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {


        String str = "silent";
        String str2 = "listen";
        char [] charArray1 =str.trim().toCharArray();
        char [] charArray2 =str2.trim().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);



        if( new String(charArray1).equals(new String(charArray2))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "Gupta", 100.00, "Male"),
                new Employee(2, "Jacob", "Gupta", 200.00, "Female"),
                new Employee(3, "Ram", "Gupta", 300.00, "Male"),
                new Employee(4, "Shyam", "Gupta", 100.00, "Female")
        );

        Map<String, List<Employee>> map =  employees.stream().collect(Collectors.groupingBy(Employee::getGender));

        map.forEach((key, value) -> {
            //String str = m.getKey() +"---"+m.getValue().stream().collect(Collectors.joining(","));

            System.out.print(key + "----");
            value.stream().map(Employee::getEmpName).forEach(System.out::print);
            System.out.println();
        });
    }
}
