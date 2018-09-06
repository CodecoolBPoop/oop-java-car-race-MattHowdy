package com.codecool;


public class Motorcycle extends Vehicle {
    static int numberOfMotorcycle = 1;


    @Override
    public void setVehicleSpeed(int speed){

        if (Weather.isRaining()) {
            this.vehicleSpeed = speed- Util.randomNum(5,50);
        } else {
            this.vehicleSpeed = speed;
        }
    }

    @Override
    public void moveForAnHour(Race race){
        setVehicleSpeed(100);
        distanceTravelled += getVehicleSpeed();
    }


    public Motorcycle(){
        setVehicleName("Motorcycle " + Integer.toString(numberOfMotorcycle++));
        setVehicleSpeed(100);
    }
}
