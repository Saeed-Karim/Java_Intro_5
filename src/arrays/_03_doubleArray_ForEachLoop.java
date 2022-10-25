package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {
        // 1. create an array to store -> 5.5, 6, 10.3, 25


        // 2. Print the array -> [5.5, 6, 10.3, 25]


        // 3. Print the size of the array -> 4

        double[] numbers = {5.5, 6, 10.3, 25};

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);

        System.out.println("\n---------For Each Loop--------\n");
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}
