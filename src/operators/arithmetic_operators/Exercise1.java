package operators.arithmetic_operators;

import java.sql.SQLOutput;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Assume that you have a rectangle
        short side is equal to 4 units
        long side is equal to 7 units
        find area and perimeter of the rectangle

        Area = shortSide * longSide
        Perimeter = 2 * shortSide + 2 * longSide
        Perimeter = 2 * (shortSide + longSide)
        expected output :
        Area is = 28
        Perimeter = 22

         */
        System.out.println("\n-----Task3-----\n");
        int shortSide = 4, longSide = 7;
        int Area = 28;

        System.out.println("Area is = " + shortSide * longSide);
        System.out.println("Perimeter = " + 2 * (shortSide + longSide));

    }
}
