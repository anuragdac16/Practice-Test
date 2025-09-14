package com.app.anurag;

import java.math.BigDecimal;
import java.text.Collator;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {



            int temp[] = {30,33,35,36,38};
            String city[] = {"mumbai","bangalore","delhi","chennai","bangalore"};
            //each city with average temperature and decimal will be followed by only 2 digit
//o/p
            // {"Mumbai"- 30, "bangalore"-35.50, "delhi"-35, "chennai"-36};

            Map<String, Double> output = new HashMap<>();
            Map<String, Integer> counter = new HashMap<>();

            // BigDecimal decimal = new BigDecimal(2);

            for(int i = 0; i < temp.length; i++){
                if(output.get(city[i]) != null){
                    double t = output.get(city[i]);
                    output.put(city[i], t+temp[i]);
                    int count = counter.get(city[i]);
                    counter.put(city[i],++count);
                }else{
                    output.put(city[i], Double.valueOf(temp[i]));
                    counter.put(city[i],1);
                }
            }
            output.entrySet().stream().forEach( entry -> {
                int count = counter.get(entry.getKey());

                String st = String.format("%s ----- %.2f", entry.getKey() ,entry.getValue()/count);
                System.out.println(st);
                System.out.println(entry.getKey() + "---"+ decfor.format(entry.getValue()/count));
            });


            List<List<Integer>> number = new ArrayList<>();

            // adding the elements to number arraylist
            number.add((Arrays.asList(1, 2)));
            number.add((Arrays.asList(3, 4)));
            number.add((Arrays.asList(5, 6)));
            number.add((Arrays.asList(7, 8)));

            System.out.println("List of list-" + number);

            //using flatmap() to flatten this list
            List<Integer> flatList
                    = number.stream()
                    .flatMap(Collection::stream)
                    .toList();

            // printing the list
            System.out.println("List generate by flatMap-" + flatList);

    }
}