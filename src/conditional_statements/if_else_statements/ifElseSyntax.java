package conditional_statements.if_else_statements;

public class ifElseSyntax {
    public static void main(String[] args) {

        /*
        - if or else statements are used to control the flow of the program based on conditions
        - conditions are always boolean statement (true or false)
        - IF block can be used without else block
        - ELSE block CAN NEVER be used without IF block
         */

        boolean condition = false;


        if (condition) {
            //this is the IF block and if executes if the condition is true
            System.out.println("AAA");
        } else {
            // this is the ELSE block, and it executes if condition is false
            System.out.println("BBB");

            System.out.println("End of the program");
        }
    }
}