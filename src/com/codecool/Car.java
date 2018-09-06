package com.codecool;

import java.util.Arrays;
import java.util.List;


public class Car extends Vehicle{
    List<String> carNames = Arrays.asList("Mythic", "Liberty", "Encounter", "Spotlight",
                                                "Silver", "Presence", "Augury", "Symbol", "Supremacy",
                                                "Shadow", "Vision", "Hollo", "Avalanche", "Serpent",
                                                "Epitome", "Eminance", "Catalyst", "Charm", "Serpent", "Sanctuary");



    public void moveForAnHour(Race race){
        if(Race.isThereABrokenTruck()){
            setVehicleSpeed(75);
        }else{
            setVehicleSpeed(Util.randomNum(80,100));
        }
        distanceTravelled += getVehicleSpeed();
    }


    public Car(){
        setVehicleSpeed(Util.randomNum(80,100));
        setVehicleName(Util.randomCarName(carNames));
    }


}
