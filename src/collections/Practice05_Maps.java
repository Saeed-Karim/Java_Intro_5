package collections;

import java.util.*;

public class Practice05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle

        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
        */

        System.out.println(favorites.keySet());


        /*
        Get values and print them
        [Car, Color, City, Day, Pet]
        */

        System.out.println(favorites.values());
        for (String value : favorites.values()) {
            System.out.println(value);

        }

        /*
        Print all entries as below
        1. key = car and value for it = lexus
        2.
        3.
        4.
        5.
         */


    int i  = 1;
        for (Map.Entry<String, String> entry : favorites.entrySet()){
            System.out.println(i++ +". Key = " + entry.getKey() + " and the value for it = " + entry.getValue());
        }


        }



    }

