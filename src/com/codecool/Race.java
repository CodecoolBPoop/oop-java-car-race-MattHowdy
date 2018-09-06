package com.codecool;


import java.util.ArrayList;
import java.util.List;

public class Race{

    static List<Vehicle> vehiclesList = new ArrayList();


    private static void createVehicle(){

        for (int i = 0; i <10 ; i++) {
            vehiclesList.add(new Car());
            vehiclesList.add(new Truck());
            vehiclesList.add(new Motorcycle());
        }

    }


    private void simulateRace(){
        for (int round = 0; round < 50; round++) {

            Weather.setRaining();
            isThereABrokenTruck();

            for (Vehicle vehicle : vehiclesList){
                vehicle.moveForAnHour(this);
            }
        }

    }


    private void printRaceResults(){

        for(Vehicle vehicle : vehiclesList){
            System.out.println(vehicle.getVehicleName() + " is travelled " +
                    vehicle.getDistanceTraveled() + " khm with an average speed of " +
                    vehicle.getVehicleSpeed() + ".");
        }
    }


    public static boolean isThereABrokenTruck(){
        for(Vehicle vehicle : vehiclesList){
            if(vehicle instanceof Car && Truck.getBrokenTruck()){
                vehicle.setVehicleSpeed(75);
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Race race = new Race();

        race.createVehicle();
        race.simulateRace();
        race.printRaceResults();

        }
    }



