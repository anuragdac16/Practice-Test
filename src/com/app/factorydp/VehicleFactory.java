package com.app.factorydp;

public class VehicleFactory {

    public Vehicle getInstance(String type){

        if(type.equals("4")){
            return new FourWheeler();
        } else if(type.equals("2")){
            return new TwoWheeler();
        }else{
            throw new VehicleException("Invalid Vehicle Type");
        }

    }
}
