package string_methods;

public class _08_length_Method {
    public static void main(String[] args) {
        /*
        1. Return
        2. Returns INT which is the total count of characters
        3. non - static
        4. does not take any arguments
         */

        String s = "John";

        System.out.println(s.length()); //4

        int len = s.length();

        System.out.println(len); // 4

        System.out.println("".length()); // 0
        System.out.println(" ".length()); //1
        System.out.println("  ".length()); //2


    }
}
