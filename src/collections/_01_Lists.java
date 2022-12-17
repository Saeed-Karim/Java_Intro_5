package collections;

import java.util.ArrayList;
public class _01_Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        /*
        -They preserve insertion order
        -They allow duplicates
        -They allow null elements

        -Performance
        -Memory
        -Initial capacity
        -Load
        -The way they store ata
        */

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null]
    }
}
