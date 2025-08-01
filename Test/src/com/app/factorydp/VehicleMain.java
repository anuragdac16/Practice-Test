package com.app.factorydp;

public class VehicleMain {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.getInstance("4");
        System.out.println(vehicle.getNumberOfWheel());
        System.out.println("________");
        Vehicle vehicle2 = factory.getInstance("3");
        System.out.println(vehicle2.getNumberOfWheel());


    }

}
