package com.codecool;
import java.util.List;


public class Util{

    static int randomNum(int min, int max){
        int speed = (int) (Math.random()  * (max-min)) + min;
        return speed;
    }


    static String randomCarName(List<String> carNames){
        int size = carNames.size();

        String carname1 = carNames.get(randomNum(1,size));
        String carname2 = carNames.get(randomNum(1,size));

        return carname1 + " " + carname2;
    }


}
