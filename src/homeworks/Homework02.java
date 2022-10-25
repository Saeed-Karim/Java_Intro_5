package homeworks;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {

        System.out.println("\n------TASK-1------\n");

            int num1, num2;

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter 2 numbers");

            num1 = input.nextInt();

            num2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + num1);

        System.out.println("The number 2 entered by user is = " + num2);



            int sum = num1 + num2;

            System.out.println("The sum of number 1 and 2 entered by user is = " + sum);





        System.out.println("\n------TASK-2------\n");

        System.out.println("Please enter 2 numbers");

        int num3;

        int num4;

        num3 = input.nextInt();

        num4 = input.nextInt();

        System.out.println("The product of the given 2 numbers is: " + num3 * num4);





        System.out.println("\n------TASK-3------\n");

        System.out.println("Please enter 2 floating numbers as a double ");

        double num5;

        double num6;

        num5 = input.nextDouble();

        num6 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (num5 + num6));

        System.out.println("The product of the given numbers is = " + (num5 * num6));

        System.out.println("The subtraction of the given numbers is = " + (num5 - num6));

        System.out.println("The division of the given numbers is = " + (num5 / num6));

        System.out.println("The remainder of the given numbers is = " + (num5 % num6));




        System.out.println("\n------TASK-4------\n");

        System.out.println("1.\t" + (-10 + 7 * 5));

        System.out.println("2.\t" +  (72+24) % 2);

        System.out.println("3.\t" +  (10 + -3*9 / 9));

        System.out.println("4.\t" +  (5 + 18 / 3 * 3 - (6 % 3)));





        System.out.println("\n------TASK-5------\n");

        System.out.println("Please enter 2 numbers");

        int num8;

        int num9;

        num8 = input.nextInt();

        num9 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num8 + num9) / 2);





        System.out.println("\n------TASK-6------\n");

        System.out.println("Please enter 5 numbers");

        int num10;

        int num11;

        int num12;

        int num13;

        int num14;

        num10 = input.nextInt();

        num11 = input.nextInt();

        num12 = input.nextInt();

        num13 = input.nextInt();

        num14 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num10 + num11 + num12 + num13 + num14) / 5);





        System.out.println("\n------TASK-7------\n");

        System.out.println("Please enter 3 numbers");

        int num15 = 5;

        int num16 = 6;

        int num17 = 10;

        num15 = input.nextInt();

        num16 = input.nextInt();

        num17 = input.nextInt();

        System.out.println("The " + num15 + " multiplied with " + num15 + " is = " + num15 * num15);

        System.out.println("The " + num16 + " multiplied with " + num16 + " is = " + num16 * num16);

        System.out.println("The " + num17 + " multiplied with " + num17 + " is = " + num17 * num17);






        System.out.println("\n------TASK-8------\n");

        System.out.println("enter the side of the square");

        int num18 = input.nextInt();


        System.out.println("Perimeter of the square = " + num18 * 4);

        System.out.println("Area of the square = " + num18 * num18);






        System.out.println("\n------TASK-9------\n");

        double yearlySalary = 90000;

        System.out.println("A Software Engineer in Test can earn $" + (yearlySalary * 3) + " in 3 years.");

        input.nextLine();





        System.out.println("\n------TASK-10------\n");


        System.out.println("What is your favorite book ?");

        String favBook = input.nextLine();

        System.out.println("What is your favorite color ?");

        String favColor = input.nextLine();

        System.out.println("What is your favorite number ?");

        String favNumber = input.nextLine();

        System.out.println("User's favorite book is: " + favBook);

        System.out.println("User's favorite color is: " + favColor);

        System.out.println("User's favorite number is: " + favNumber);




        System.out.println("\n------TASK-11------\n");

        System.out.println("What is your first name ?");

        String firstName = input.nextLine();

        System.out.println("What is your last name ?");

        String lastName = input.nextLine();

        System.out.println("What is your age ?");

        int age = input.nextInt();

        input.nextLine();

        System.out.println("What is Email Address ?");

        String emailAddress = input.nextLine();

        System.out.println("What is your Phone Number ?");

        String phoneNumber = input.nextLine();

        System.out.println("What is your Address ?");

        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " "+lastName +". " + firstName + "'s age is \n"
                + age + ". " + firstName + "'s " + "email address is " + emailAddress +", phone number\n" +
                "is " + phoneNumber +", and address is " + address + ".");







        }
    }



