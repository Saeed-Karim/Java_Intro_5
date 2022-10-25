package operators.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {
        /*
        Find the result of below expressions
        3+5 = 8
        5-2 = 3
        10 / 2 = 5
        2 * 4 = 8
        10 % 3 = 1
        */

        System.out.println("\n---------------Task-1----------------\n");
        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(10 / 2);
        System.out.println(2 * 4);
        System.out.println(10 % 3);

        /*
        Create 2 int variables called as num1 and num2
        And store 6 and 4 in these variables respectively
        Find there
        sum
        subtraction
        product
        division
        remainder
        */

        int num1 = 6;
        int num2 = 4;

        System.out.println("\n---------------Task-2----------------\n");
        System.out.println("The sum of numbers is = " + (num1 + num2)); //10 (6+4)
        System.out.println("The subtraction of numbers is = " + (num1 - num2)); //2 (6-4)
        System.out.println("The product of numbers is = " + num1 * num2); //24 (6*4)
        System.out.println("The divisiopn of numbers is = " + num1 / num2); //1 (6/4)
        System.out.println("The sum of numbers is = " + num1 % num2); //2 (6%4)






}
}



