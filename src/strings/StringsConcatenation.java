package strings;

public class StringsConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + " " + s2; // "Hello" + "World"

        System.out.println(s3); // Hello World

/*
TASK
Create 2 strings to store your firstName and lastName
Then concatenate them with a third String called as fullName
Then print the full name
 */

        System.out.println("\n--------------Concatenation with + operator--------------\n");
        String firstName = "Saeed";
        String lastName = "Karim";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("\n--------------Concatenation with concat() method--------------\n");

        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println(fullName2);

        String firstName1 = "Mike";
        String lastName2 = "Jones";
        String fullName1 = firstName1 + " " + lastName2;
        System.out.println(fullName1);
    }
}







