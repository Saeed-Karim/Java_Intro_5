package operators.increment_decrement_operators;

import java.sql.SQLOutput;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        3 * 1 = 3
        3 * 2 = 6
        3 * 3 = 9
        3 * 4 = 12
        3 * 5 = 15
        3 * 6 = 18
        3 * 7 = 21
        3 * 8 = 24
        3 * 9 = 27
        3 * 10 = 30
        */

        int num = 5;
        int start = 1;

        System.out.println(num + " * " + 1 + " = " + num * 1);
        System.out.println(num + " * " + 2 + " = " + num * 2);
        System.out.println(num + " * " + 3 + " = " + num * 3);
        System.out.println(num + " * " + 4 + " = " + num * 4);
        System.out.println(num + " * " + 5 + " = " + num * 5);
        System.out.println(num + " * " + 6 + " = " + num * 6);
        System.out.println(num + " * " + 7 + " = " + num * 7);
        System.out.println(num + " * " + 8 + " = " + num * 8);
        System.out.println(num + " * " + 9 + " = " + num * 9);
        System.out.println(num + " * " + 10 + " = " + num * 10);



        // NEW


        int num1 = 5;
        int start1 = 1;
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);
        System.out.println(num1 + " * " + start1 + " = " + num * start1++);




    }
}
