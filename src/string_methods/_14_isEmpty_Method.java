package string_methods;

public class _14_isEmpty_Method {
    public static void main(String[] args) {
        /*
        1. - Return
        2. - Returns BOOLEAN
        3. - non - static
        4. - It does not take any argument
         */

        String s1 = "Hello";
        String s2 = " ";
        String s3 = ""; // length is equal to zero

        System.out.println(s1.isEmpty()); // False
        System.out.println(s2.isEmpty()); // False
        System.out.println(s3.isEmpty()); // True
    }
}
