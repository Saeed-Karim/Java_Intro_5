package conditional_statements.turneryOperator;

public class UnderstandingTernary {
    public static void main(String[] args) {

        /*
        F --> Female --> Jane
        M --> Male --> John
         */

        char gender = 'F';

        String name = gender == 'F' || gender == 'f' ? "Jane" : "John";

        System.out.println(name);

    }
}
