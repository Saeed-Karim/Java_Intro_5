package utilities;

public class MathHelper {

    /*
    Write a method that returns the max number of 3 int numbers
     */

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }


    /*
    Write a method that returns the min number of 3 int numbers
     */

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    /*
    Write a method that returns the middle number of 3 int numbers
    Assume numbers can never be equal to each other
     */

    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);

        return num1 + num2 + num3 - min - max;
    }


    /*
    Create a method that takes an int as an argument and returns true if it is even
    returns true if it is odd

    return type
    return boolean
    static
    public
    takes an int as arg
    method name = isEven
     */

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

        /*
        public static boolean isEven(int num){
            return num % 2 ==0;
         */


        /*
    Create a method that takes an int as an argument and returns true if it is Odd
    returns true if it is even

    return type
    return boolean
    static
    public
    takes an int as arg
    method name = isOdd
     */


    }


    public static boolean isOdd(int num) {
        if (num % 2 != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* Create a method that takes 2 int arguments and returns their sum
    Method name = sum

    public static
    return type
    returns int
    it takes 2 ints

     */

    public static int sum(int a, int b) {
        return a + b;
    }

    // OVERLOADING A METHOD

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;

    }

    public static long sum(long a, long b) {
        return a + b;
    }

}








