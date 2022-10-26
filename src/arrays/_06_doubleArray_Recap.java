package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {
        // create double array with these values
        // using curly braces
        // 1.5, 2.3, -1.3, -3.7

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " +decimals.length);
        // 1.5, 2.3, -1.3, -3.7 --> {-3.7, -1.3, 1.5, 2.3}
        Arrays.sort(decimals);

        System.out.println("Arrays after sorting " + Arrays.toString(decimals));

        /*
        output :
        -3.7
        -1.3
        1.5
        2.3
         */
        // When you DO NEED indexes or increments to use go with FOR I with arrays
        System.out.println("\nFOR I Loop print below :");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);

            // When you DO NOT NEED indexes or an increment to use go with FOR EACH with arrays
            System.out.println("\n FOR EACH loop print below");
            for (double d : decimals) {
                System.out.println(d);
            }

            System.out.println("\n FOR I loop print two arrays below");
            for (int j = 0; j < decimals.length; j++) {
                System.out.println(decimals[j] + " - " + chars[j]);
            }

        }
    }
}
