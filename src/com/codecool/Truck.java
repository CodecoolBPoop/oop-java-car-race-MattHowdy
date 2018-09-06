package com.codecool;


public class Truck extends Vehicle{
    static boolean brokenTruck = false;
    static int round = 0;
    static int brokenround;

    static boolean getBrokenTruck(){
        return brokenTruck;
    }

    public static void repairTruck(){
        if(brokenround + 3 == round){
            brokenTruck = false;
        }
    }


    public static void truckBreaksDown(){
        int chanceOfBreakDown = Util.randomNum(1,100);
        if(chanceOfBreakDown <= 5){
            brokenTruck = true;
            brokenround = round;
        }else{
            brokenTruck= false;
            }
    }

    @Override
    public void setVehicleSpeed(int speed){
        if (getBrokenTruck()) {
            this.vehicleSpeed = 0;
        } else {
            this.vehicleSpeed = speed;
        }
    }

    @Override
    public void moveForAnHour(Race race){
        truckBreaksDown();
        repairTruck();
        setVehicleSpeed(100);
        distanceTravelled += getVehicleSpeed();
        round++;
    }


    public Truck(){
        setVehicleName(Integer.toString(Util.randomNum(1,1000)));
        setVehicleSpeed(100);
    }

}
