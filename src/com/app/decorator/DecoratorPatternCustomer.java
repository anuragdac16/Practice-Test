package com.app.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {
    private static int  choice;
    public static void main(String[] args) throws IOException {

        while (choice != 4){
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    Food vf = new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                }
                break;

                case 2: {
                    Food nonveg = new NonVegFood((Food)new VegFood());
                    System.out.println(nonveg.prepareFood());
                    System.out.println(nonveg.foodPrice());
                }
                break;

                case 3:{
                    Food chineese = new ChineeseFood(new VegFood());
                    System.out.println(chineese.prepareFood());
                    System.out.println(chineese.foodPrice());
                }
                break;

                default:
                    break;
            }
        }
    }
}
