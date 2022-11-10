package practice.doloPractice;

import java.util.Arrays;

public class PracticeSolo {
    public static void main(String[] args){

        int[] ages = {21, 22, 23, 24, 25};
        System.out.println(ages[2]);

        String[] countries = new String[4];
        System.out.println(Arrays.toString(countries));

        countries[0] = "Mexico";
        countries[1] = "Cuba";
        countries[2] = "Argentina";
        countries[3] = "Columbia";
        System.out.println(Arrays.toString(countries));

        for (int i = 0; i <= 3; i++) {
            System.out.println("The country index of " + i + " = " + countries[i]);


            System.out.println("NEW TASK");

            int[] numbers  = {1, 2, 3, 4, 5, 6};
            System.out.println(Arrays.toString(numbers));

            for (int j = 0; j < numbers.length ; j++) {
                System.out.println(numbers[j]);
            }

            System.out.println("-----");
            for (int n : numbers) {
                System.out.println(n);
            }

            System.out.println("-----");

            int[] stuff = {-1, -2, 1, 2, 3, 4, 5, 6};
            for (int M : stuff) {
                System.out.println(M);
            }

            System.out.println("-----1---");

            double[] dubs = {5.5, 6.0, 10.3, 25.0};

            System.out.println(Arrays.toString(dubs));
            System.out.println(dubs.length);

            for (double dub : dubs){
                System.out.println(dub);
            }

            System.out.println("new task");

            int[] numbers1 = {5, 4, 3, 2, 1};
            String[] stuff1 = {"remote", "computer", "Cup", "Phone" };

            System.out.println(Arrays.toString(numbers1));
            System.out.println(Arrays.toString(stuff1));

            Arrays.sort(stuff1);
            Arrays.sort(numbers1);
            System.out.println(Arrays.toString(stuff1));
            System.out.println(Arrays.toString(numbers1));










        }






    }
}
