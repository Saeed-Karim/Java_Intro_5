package operators.arithmetic_operators;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        An annual average salary for an SDET in the Units States is 90K.
        Write a Java program that calculates the prints the monthly and bi-weekly and
        weekly average amount that an SETSs makes in the United States

        Expected Output
        Monthly : 7500
        Bi - Weekly : 3461
        Weekly : 1730

         */

        double yearlySalary = 90_000;


        System.out.println("Monthly : " + yearlySalary / 12);
        System.out.println("BiWeekly:" + yearlySalary / 26);
        System.out.println("Weekly:" + yearlySalary / 52);



    }


}
