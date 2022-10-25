package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        1. - Return
        2. - Returns BOOLEAN
        3. - non - static
        4. - Take one argument as CharSequence

         */

        String s = "TechGlobal School";
        System.out.println(s.contains("Tech")); //  True
        System.out.println(s.contains("School")); // True
        System.out.println(s.contains("a")); // True
        System.out.println(s.contains("E"));// False

        //IMPORTANT
        System.out.println(s.contains("")); // True
        System.out.println(s.contains(s)); // True
        System.out.println(s.contains("Education")); // False

    }
}
