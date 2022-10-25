package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        /*
        TASK-1
        Check the collection you have above and print true if it contains Mouse
        Print false otherwise

        RESULT:
        true
        */

        boolean hasM = false;

        for(String object : objects) {
            if (object.equals("Mouse")) {
                hasM  = true;
                break;
            }
        }
        System.out.println(hasM);

        System.out.println("\n--------with binary search----------\n");
        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Computer") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); //  true

    }
}
