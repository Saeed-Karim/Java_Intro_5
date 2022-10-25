package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {

        /*
        1. Return
        2. returns a STRING
        3. non-static
        4. no arguments
         */
        String s1 = "  Hello   ";

        System.out.println(s1.length()); // 10
        s1 = s1.trim();
        System.out.println(s1.trim().length()); // 5

        System.out.println(s1); // Hello
        System.out.println(s1.length()); // 5

        System.out.println("  Hello World   ".trim());


    }
}
