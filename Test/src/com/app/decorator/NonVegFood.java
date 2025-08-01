package com.app.decorator;

public class NonVegFood extends FoodDecorator{

    public NonVegFood(Food newFood){
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " for Non vegeterian";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+ 150.0;
    }
}
