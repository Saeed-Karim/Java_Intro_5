package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice07_ProductPrices {
    public static void main(String[] args) {
        /*
        iPhone      -> 1000.0
        MacBook Pro -> 1300.0
        iMac        -> 1500.0
        AirPods     -> 200.0
        iPad        -> 700.0
        Task 1:
        Find Most expensive product and print it as below

        Expected output:
        iMac is the most expensive with the price of $1500.0

        1. Store the items in a HashMap
        2. Find the max price value from HasMap Values
        3. Loop and find the item which has the value equals to max price
         */


        HashMap<String, Double> products = new HashMap<>();

        products.put("iPhone", 1000.00);
        products.put("MacBook Pro", 1300.00);
        products.put("iMac", 1500.00);
        products.put("Airpods", 200.00);
        products.put("iPad", 700.00);

        double maxPrice = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() == maxPrice){
                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
                break;
            }
        }









    }
}
