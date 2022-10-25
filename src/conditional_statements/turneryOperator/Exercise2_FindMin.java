package conditional_statements.turneryOperator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        /*
        TASK
        Write a program that generates 2 random numbers bt 1 and 10
        Find and print the smallest number

        USE TERNARY
        */

        Random random = new Random();

        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;


        System.out.println("The random 1 is = " + num1);
        System.out.println("The random 2 is = " + num2);
        int min = num1 < num2 ? num1 : num2;


        System.out.println(min);






    }
}
