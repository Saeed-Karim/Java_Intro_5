package arrays;



public class _11_charArrayRecap {
    public static void main(String[] args) {
        //      Create a char array which will hold your name's letters with both ways (new keyword, curly brackets)
        // ['S', 'a', 'l', 'i', 'h']

        char[] initials = new char[5];
        initials[0] = 'S';
        initials[1] = 'a';
        initials[2] = 'e';
        initials[3] = 'e';
        initials[4] = 'd';
        char[] initials2 = {'S', 'a', 'e', 'e', 'd'};
//        System.out.println(Arrays.toString(initials));
//        System.out.println(Arrays.toString(initials2));


        initials[0] = 's';
        initials[0] = initials[4];
        initials[2] = initials[4];
//        System.out.println(Arrays.toString(initials));

        // Salih
        System.out.println("\nfor each loop print");
        for (char in : initials2){
            System.out.print(in);
        }

        System.out.println("\nfori loop print");
        for (int i = 0; i < initials2.length; i++) {
            System.out.print(initials2[i]);
        }

    }
}







