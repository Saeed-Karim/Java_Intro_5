package projects;

import java.util.Arrays;

import static arrays._09_Find_Max_Min.printMaxAndMinWithSort;
import static arrays._13_SecondGreatest_SecondSmallest.findMax;
import static arrays._13_SecondGreatest_SecondSmallest.findMin;

public class Projects05 {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1----------\n");


        int[] numbers = {10, 7, 10, -3, 10, -3};


        Arrays.sort(numbers);
        if (numbers.length > 0){
            System.out.println("Greatest = " + numbers[numbers.length - 1]);
            System.out.println("Smallest = " + numbers[0]);
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

        }
        System.out.println("\n----------TASK-3----------\n");

        int[] num1 = {10, 5, 6, 7, 8, 5, 15, 15};

        int secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;

        Arrays.sort(num1);

        for (int n : num1) {
            if (n > secondMax && n < findMax(num1)){
                secondMax = n;
            }

            if (n < secondMin && n > findMin(num1)){
                secondMin = n;
            }
        }

        System.out.println("second smallest = " + secondMin );
        System.out.println("second Greatest = " + secondMax );







        System.out.println("\n----------TASK-4----------\n");

        int[] num = {10, 5, 6, 7, 8, 5, 15, 15};

        int secondMax1 = Integer.MIN_VALUE, secondMin1 = Integer.MAX_VALUE;

        for (int n : num) {
            if (n > secondMax && n < findMax(num)){
                secondMax = n;
            }

            if (n < secondMin && n > findMin(num)){
                secondMin = n;
            }
        }

        System.out.println("second smallest = " + secondMin );
        System.out.println("second Greatest = " + secondMax );

    }





    }







