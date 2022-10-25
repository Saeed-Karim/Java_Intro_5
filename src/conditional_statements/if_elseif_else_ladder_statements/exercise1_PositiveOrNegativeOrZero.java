package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number
        if number is more than zero, print "POSITIVE"
        if number is less than zero, print "NEGATIVE"
        Otherwise, Print "ZERO"
         */

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = inputReader.nextInt();

        if (num > 0)
        {
            System.out.println("POSITIVE");
        }

        else if (num < 0){
            System.out.println("NEGATIVE");
        }

        else {
            System.out.println("ZERO");
        }


        //         //           //              //                   //                           //





        /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

/*
Solution 1 - ladder
 */

      /*  if(num > 0){
            System.out.println("POSITIVE");
        }
        else if(num < 0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }

/*
Solution-2 nested if else statements
 */
      /*  if(num == 0){
            System.out.println("ZERO");
        }
        else{
            if(num < 0){
                System.out.println("NEGATIVE");
            }
            else{
                System.out.println("POSITIVE");
            }
        }
        2:35
/*
Write a program that asks user to enter 2 different numbers
And the greatest number and print it with a message as below

EXAMPLE PROGRAM
Program: Please enter 2 numbers
User: 5 10

Program: 10 is the greatest
 */
    }







    }

