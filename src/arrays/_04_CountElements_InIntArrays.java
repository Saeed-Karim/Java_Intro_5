package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        Negatives : 2
        Positives : 5
        Neutral or Zeros : 3

        Even : 6
        Odd : 4

        Max : 10
        Min : -7

        Sum of the numbers : 28
        Average of the numbers : 2
        How many unique numbers you have : 7
        How many of these numbers are represented in Fibonacci sequences : 6
        Prime numbers : 2
        How many numbers can be divided by 5 : 6 (counting 0's)
        Absolute difference between the max and min of these numbers : 17
        Closest number to 9 : 8 (Take the smallest number if there are 2  - *8*-9-10--   )
        */


        System.out.println("\n------Negatives------\n");


        int negatives = 0;

        for (int number : numbers) {
            if (number < 0) negatives++;
        }
        System.out.println("Negative count is = " + negatives);


        System.out.println("\n------Positives------\n");

        int positives = 0;
        for (int number : numbers) {
            if (number > 0) positives++;
        }
        System.out.println("Positive count is = " + positives);

        /*
        Count how many even numbers you have

        EXPECTED:
        6
         */

        System.out.println("\n--------FOR I-------\n");
        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;
        }

        System.out.println(even1);

        System.out.println("\n--------FOR EACH-------\n");

        int even2 = 0;

        for(int number : numbers){
            if(number % 2 == 0) even2++;
        }

        System.out.println(even2);







    }
}
