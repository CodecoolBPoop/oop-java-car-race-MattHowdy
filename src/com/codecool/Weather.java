package com.codecool;


public class Weather {
    static boolean raining;


    public static void  setRaining(){
        int chanceOfRaining = Util.randomNum(1,100);

        if(chanceOfRaining <= 30){
            raining = true;
        } else{
            raining = false;}
    }


    public static boolean isRaining(){
        return raining;
    }

}
