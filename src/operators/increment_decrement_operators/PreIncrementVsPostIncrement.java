package operators.increment_decrement_operators;

public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        int num1 =5;
        num1++; //increase by one but assign later /  num1 = 5

        System.out.println(num1); //6

        //Pre-increment
        int num2 = 5;
        ++num2; //incease by one and assign now / num2 = 6

        System.out.println(num2); //6


        //understanding difference
        byte b1 = 5, b2 = 5;

        System.out.println(b1++);
        System.out.println(++b2);


    }



}
