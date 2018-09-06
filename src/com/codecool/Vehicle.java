package com.codecool;


public abstract class Vehicle {
    int distanceTravelled = 0;
    String vehicleName;
    int vehicleSpeed;

    void setVehicleName(String name){
        this.vehicleName = name;
    }

    String getVehicleName(){
        return this.vehicleName;
    }


    public void setVehicleSpeed(int speed){
        this.vehicleSpeed = speed;
    }

    int getVehicleSpeed(){
        return this.vehicleSpeed;
    }

    int getDistanceTraveled(){
        return this.distanceTravelled;
    }


    public void moveForAnHour(Race race){
        distanceTravelled += getVehicleSpeed();
    }


    @Override
    public String toString() {
        return getVehicleName();
    }


}
