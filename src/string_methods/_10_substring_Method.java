package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /*
        1. - Return
        2. - Returns a STRING
        3. - non - static
        4. - It is overloaded, and take either one or two int index arguments


         */

        String s =  "TechGlobal";

        //Get "Global"
        String s1 = s.substring(4); // from index 4 to end
        System.out.println(s1);



        //Get Tech
        System.out.println(s.substring(0, 4));
    }
}
