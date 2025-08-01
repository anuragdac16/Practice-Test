package com.app.decorator;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+ "Chineese Food";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice()+50.0;
    }
}
