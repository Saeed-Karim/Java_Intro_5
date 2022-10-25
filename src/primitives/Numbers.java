package primitives;

import sun.misc.PostVMInitHook;

public class Numbers {
    public static void main(String[] args) {
        /* There are 6 primitives used to store numbers
        as data byte, int, long --> used to store absolute numbers like 3
        float, double --> used for floating numbers like 10.5

        byte --> 1 byte
        short --> 2 bytes
        int --> 4 bytes
        long --> 8 bytes

        NOTE : Most of the case we use int and it is enough

        John
        his age --> 45
        his balance --> 400.45

         */
        // dataType variableName = value;


        System.out.println("\n--------------numbers - byte-short-int-long----------");

        byte age = 45;
        long favNumber = 2147483648L;
        long myNumber = 1;

        System.out.println(age); // 45
        System.out.println(favNumber); //70

        /*
        Floating numbers
        float --> 4 bytes
        double --> 8 bytes

        NOTE : Most of the case we use double
         */

        float balance1 = 23.28762385763342F;
        double balance2 = 23.28762385763342;
        double price = 23.5;

        System.out.println(balance1); //23.28762385763342F
        System.out.println(balance2); //23.28762385763342
        System.out.println(price); //23.5

        double transaction = 20;

        System.out.println(transaction); //20.0




    }
}
