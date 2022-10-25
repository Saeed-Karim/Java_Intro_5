package string_methods;

import java.sql.SQLOutput;

public class _11_startsWith_endsWith_Method {
    public static void main(String[] args) {

        /*
        1. - Return
        2. - Returns BOOLEAN
        3. - non-static
        4. - There are overloaded methods, but we will use always use the one with one argument

         */
        String s = "TechGlobal";

        System.out.println(s.startsWith("T")); // True
        System.out.println(s.startsWith("t")); // false
        System.out.println(s.startsWith("Tech")); // True


        System.out.println(s.endsWith("Global")); // True

        System.out.println("END");

        //IMPORTANT
        String city = "Chicago";

        System.out.println(city.startsWith("Chicago")); // True
        System.out.println(city.startsWith(city)); // True
        System.out.println(city.endsWith("Chicago")); // True
        System.out.println(city.startsWith("")); // True
        System.out.println(city.endsWith(""));// True
        System.out.println(city.startsWith(city));
    }
}
