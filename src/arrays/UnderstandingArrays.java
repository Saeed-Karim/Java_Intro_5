package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        /*
         Declare a String and store a name in it
         Declare different Strings and store the names of your best  friends in them
         Declare different Strings and store the names of all your friends in them

         */

        String name = "James";

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; // Holding a collection of names

        // Retrieving an element from an array - using index
        System.out.println(names[2]); // Vlad
        System.out.println(names[4]); // Olena

        // ArrayIndexOutOfBoundsException 0-4
       // System.out.println(names[5]); // Array out of bounds exception
        // System.out.println(names[-1]); // Array out of bounds exception

        int age = 25;

        int[] ages = {21, 23, 25};
        System.out.println(ages[2]);





        // Storing a name in a string
       // String name = "John";

        // Storing best friends names
       // String bff1  = "Jane", bff2 = "Alex", bff3 = "Mike";

        // Storing more names
        // int i = 26;
        // char c = 'A';
        //double balance = 10;


    }
}
