package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {

        // 1.) Create  an int array and store 0, -5, 2, 10, 5, 3, -1, 0
        int[] numbers = {0, -5, 2, 10, 5, 3, -1, 0};

        // 2.) Print the array

        System.out.println(Arrays.toString(numbers));

        // 3. ) Iterate the array - print each element
        for (int i = 0; i <= 7; i++) {
            System.out.println(numbers[i]);
            // OR
            // for (int i = 0; 1 < numbers.length; i++
            // System.out.println(numbers[i]);


        }

        // For each loop way - enhanced for loop
        // for (int number : numbers) {
        // System.out.println(number);
        // }


    }
}

