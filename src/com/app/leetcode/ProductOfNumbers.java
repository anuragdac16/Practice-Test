package com.app.leetcode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfNumbers {
    public static void main(String[] args) {
        List<String> operations = Arrays.asList("ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct");
        operations = Arrays.asList("ProductOfNumbers","add","getProduct","getProduct","getProduct","add","add","add");
        List<Integer> value = Arrays.asList(null,3,0,2,5,4,2,3,4,8,2);
        value = Arrays.asList(null,1,1,1,1,7,6,7);

        List<Integer> output = new ArrayList<>();
        ProductOfNumbers productOfNumbers = null;
        for(int i =0; i <  operations.size(); i++){
            try{
                if(operations.get(i).equals("ProductOfNumbers")){
                    productOfNumbers = new ProductOfNumbers();
                }else{
                    Method method = ProductOfNumbers.class.getMethod(operations.get(i), int.class);
                    Object result = method.invoke(productOfNumbers, value.get(i));
                    if(result != null){
                        output.add((int)result);
                    }else{
                        output.add(null);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        output.stream().forEach(System.out::println);
    }
    List<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }

    public void add(int num) {
        list.add(num);
    }

    public int getProduct(int k) {

        int result =1;
        for(int i =list.size()-1; i > list.size()-1 - k ; i--){
            result = result * list.get(i);
        }
        return result;

    }
}
