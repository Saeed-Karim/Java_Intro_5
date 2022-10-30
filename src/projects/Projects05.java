package projects;

import java.util.Arrays;

import static arrays._09_Find_Max_Min.printMaxAndMinWithSort;

public class Projects05 {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1----------\n");


        int[] numbers = {10, 7, 10, -3, 10, -3};


        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Greatest = " + numbers[numbers.length - 1]);
            System.out.println("Smallest = " + numbers[0]);
        }else{
            System.out.println("Array is empty!");
        }


        System.out.println("\n----------TASK-2----------\n");

        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (greatest < n){
                greatest = n;
            }

            if (smallest > n){
                smallest = n;
            }
        }

        if (numbers.length > 0){
            System.out.println("Greatest is = " + greatest);
            System.out.println("Smallest is = " + smallest);
        }else{
            System.out.println("Array is empty!");
        }

        System.out.println("\n----------TASK-3----------\n");





    }





    }

