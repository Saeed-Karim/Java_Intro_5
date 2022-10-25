package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n---------------TASK1---------------\n");

        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Please enter your first number");
        num1 = input.nextInt();
        System.out.println("Please enter your second number");
        num2 = input.nextInt();

        System.out.println("The difference between the 2 numbers is = " + Math.abs(num1 - num2));

        System.out.println("\n---------------TASK2---------------\n");


        System.out.println("Please enter your first number");
        int number1 = input.nextInt();
        System.out.println("Please enter your second number");
        int number2 = input.nextInt();
        System.out.println("Please enter your third number");
        int number3 = input.nextInt();
        System.out.println("Please enter your fourth number");
        int number4 = input.nextInt();
        System.out.println("Please enter your fifth number");
        int number5 = input.nextInt();

        System.out.println("Max value = " + (Math.max(number1, Math.max(Math.max(number2, number3), Math.max(number4, number5)))));
        System.out.println("Min value = " + (Math.min(number1, Math.min(Math.min(number2, number3), Math.min(number4, number5)))));


        System.out.println("\n---------------TASK3---------------\n");

        int randomOne = (int) (Math.random() * (100 - 50 + 1) + 50);
        int randomTwo = (int) (Math.random() * (100 - 50 + 1) + 50);
        int randomThree = (int) (Math.random() * (100 - 50 + 1) + 50);
        System.out.println("Number 1 = " + randomOne);
        System.out.println("Number 2 = " + randomTwo);
        System.out.println("Number 3 = " + randomThree);
        System.out.println("The sum of the numbers is = " + (randomOne + randomTwo + randomThree));


        System.out.println("\n---------------TASK4---------------\n");

        double moneyAlex = 125;
        double moneyMike = 220;

        double alexMoneyAfter = moneyAlex - 25.5;
        double mikeMoneyAfter = moneyMike + 25.5;
        System.out.println("Alex's money: $" + moneyAlex);
        System.out.println("Mike's money: $" + moneyMike);


        System.out.println("\n---------------TASK5---------------\n");

        double daveBike = 390;
        double davidDaily = 15.60;

        System.out.println((int) (daveBike / davidDaily));

        System.out.println("\n---------------TASK6---------------\n");

        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("Product of 5 and 10 is = " + (i1 * i2));
        System.out.println("Division of 5 and 10 is = " + (i1 / i2));
        System.out.println("Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("Remainder of 5 and 10 is = " + (i1 % i2));


        System.out.println("\n---------------TASK7---------------\n");

        String s3 = "200", s4 = "-50";
        int i3 = Integer.parseInt(s3);
        int i4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(i3 - i4));

        System.out.println("\n---------------TASK8---------------\n");

        double quarters = 0.75;
        double dime = 0.10;
        double nickels = 0.05;
        double penny = 0.01;
        int daysTo24 = (int) (24 / (quarters + dime + nickels + penny));
        int daysTo168 = (int) (168 / (quarters + dime + nickels + penny));
        double daysTo150 = (150 * (quarters + dime + nickels + penny));

        System.out.println(daysTo24 + " days");
        System.out.println(daysTo168 + " days");
        System.out.println("$" + daysTo150);

        System.out.println("\n---------------TASK9---------------\n");

        double newCpu = 1250;
        double SaveForCpu = 62.5;
        int totalDays = (int) (newCpu / SaveForCpu);

        System.out.println(totalDays);


        System.out.println("\n---------------TASK10----------------\n");

        int carSavings = 14265;
        double option1 = 475.50;
        int option2 = 951;

        System.out.println("Option 1 will take " + ((int) (carSavings / option1)) + (" Months"));
        System.out.println("Option 2 will take " + (carSavings / option2) + (" Months"));


        System.out.println("\n---------------TASK11----------------\n");


        int Number1;
        int Number2;

        System.out.println("Please First Number");
        Number1 = input.nextInt();
        System.out.println("Please Second Number");
        Number2 = input.nextInt();

        System.out.println(Number1 / (double) Number2);


        System.out.println("\n---------------TASK12----------------\n");


        int OneRandom = (int) (Math.random() * (100 + 1) + 0);
        int TwoRandom = (int) (Math.random() * (100 + 1) + 0);
        int ThirdRandom = (int) (Math.random() * (100 + 1) + 0);



        if(OneRandom > 25 && TwoRandom > 25 && ThirdRandom > 25){
            System.out.println("True");
        }
            else{
                System.out.println("False");
            }


        System.out.println("\n---------------TASK13----------------\n");

        System.out.println("Hey User , Please enter a number between 1 to 7 ");
        int DayOfTheWeek = input.nextInt();
        if(DayOfTheWeek == 1){
            System.out.println("MONDAY");
        }
        else if(DayOfTheWeek == 2){
            System.out.println("TUESDAY");
        }
        else if(DayOfTheWeek == 3){
            System.out.println("WEDNESDAY");
        }
        else if(DayOfTheWeek == 4){
            System.out.println("THURSDAY");
        }
        else if(DayOfTheWeek == 5){
            System.out.println("FRIDAY");
        }
        else if(DayOfTheWeek == 6){
            System.out.println("SATURDAY");
        }
        else if(DayOfTheWeek == 7){
            System.out.println("SUNDAY");
        }


        System.out.println("\n---------------TASK14----------------\n");

        int exam1;
        int exam2;
        int exam3;

        System.out.println("What were your exam results ? ");
        exam1 = input.nextInt();
        exam2 = input.nextInt();
        exam3 = input.nextInt();
        input.nextLine();

        int average = (exam1 + exam2 + exam3) / 3;

        if(average >= 70){
            System.out.println("YOU PASSED!");
        } else{
            System.out.println("YOU FAILED!");
        }


        System.out.println("\n---------------TASK15----------------\n");

        int OneNum;
        int TwoNum;
        int ThreeNum;
        System.out.println("Please enter 3 Numbers");

        OneNum = input.nextInt();
        TwoNum = input.nextInt();
        ThreeNum = input.nextInt();
        input.nextLine();

        if(OneNum == TwoNum && (TwoNum == ThreeNum)){
            System.out.println("TRIPLE MATCH");}
            else if(OneNum == TwoNum || TwoNum == ThreeNum || OneNum == ThreeNum){
            System.out.println("DOUBLE MATCH");
            }
            else{
                System.out.println("NO MATCH");


        }








































    }


}







