package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {

        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));
        System.out.println("Difference between your numbers is = " + Math.abs(14 - 10));
        System.out.println("Subtraction between your numbers is = " + (10 - 14));



        /*
        Write a program that asks user two ages and gets the difference between ages and print them

        Output :
        "Please enter an age"
        Input:
        Please enter another age
        Input:
        32

        "Difference between ages = 8"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an age");
        int age1 = scanner.nextInt();


        System.out.println("Please enter an age");
        int age2 = scanner.nextInt();


        System.out.println("Difference between age is = " + Math.abs(age1 - age2));

        System.out.println("Biggest age is = " + Math.max(age1, age2));
        System.out.println("Smallest age is = " + Math.min(age1, age2));







    }
}
