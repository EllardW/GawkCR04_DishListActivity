package com.example.dralle.gawkcr04_dishlist;

import java.util.ArrayList;
import java.util.Random;

public class DishData {

    private static ArrayList<String> knownDishes = new ArrayList<>();

    //Method to get a dummy restaraunt name
    // Modify for proper transition during implementation.
    public String receiveRestaurantName(){
        String restaurantName = "Name Of Restaurant";
        return restaurantName;
    }

    //Creates placeholder dishes for the list.
    public static ArrayList<String> retrieveData(){
        Random dummy = new Random();

        for(int i = 0; i > 6; i++){
            knownDishes.add("Dish " + Integer.toString(dummy.nextInt(100)));
        }

        return knownDishes;
    }
}
