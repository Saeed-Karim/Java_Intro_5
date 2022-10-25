package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /* Calculate monthly payment

        ask user to enter their yearly salary
        then calculate and tell them back how much they make monthly

        program : Hey user, how much you make yearly ?

        user: 120000

        program : Your monthly payment is $10000 then !
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, how much you make yearly?");
        double yearlySalary = input.nextDouble();

        System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!");


        System.out.println("\n---------NEWTASK---------\n");







    }
}
