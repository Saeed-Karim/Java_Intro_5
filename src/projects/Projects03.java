package projects;

public class Projects03 {
    public static void main(String[] args) {

        System.out.println("\n------------TASK1------------\n");

        int num1 = Integer.parseInt("24");
        int num2 = Integer.parseInt("5");

        System.out.println("The sum of 24 and 5 = " + (num1 + num2));
        System.out.println("The subtraction of 24 and 5 = " + (num1 - num2));
        System.out.println("The division of 24 and 5 = " + (num1 / (double) num2));
        System.out.println("The multiplication of 24 and 5 = " + (num1 * num2));
        System.out.println("The remainder of 24 and 5 = " + (num1 % num2));

        System.out.println("\n-----TASK2-----");

        int randomNumber = (int) Math.random() * (35 -1 + 1) + 1;

        int random = (int) (Math.random() * (35 - 1 + 1) + 1);
        System.out.println(random);
        if (random % random == 0) {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER ");
        } else {
            System.out.println("THE NUMBER IS A PRIME NUMBER ");
        }



        System.out.println("\n------------TASK3------------\n");

        int myRandom1 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom2 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom3 = (int)(Math.random() * (50 - 1 + 1) +1);

        System.out.println(myRandom1);
        System.out.println(myRandom2);
        System.out.println(myRandom3);

        int maxNumber = Math.max(myRandom3, Math.max(myRandom1, myRandom2));
        int minNumber1 = Math.min(myRandom3, Math.min(myRandom1, myRandom2));
        int midNumber1 = (myRandom1 + myRandom2 + myRandom3 - maxNumber - minNumber1);

        System.out.println("Lowest number is = " + minNumber1);
        System.out.println("Middle number is = " + midNumber1);
        System.out.println("Greatest number is = " + maxNumber);

        System.out.println("\n------------Task 4------------\n");

        char a1 = '5', a2 = 'a', a3 = 'R';

        if(a1 >= 65 && a1 <=90){
            System.out.println("The letter is Uppercase");
        } else if (a1 >= 97 && a1 <= 122) {
            System.out.println("The Letter is Lowercase");
        } else{
            System.out.println("Invalid Character Detected!!!");
        }

        if(a2 >= 65 && a2 <=90){
            System.out.println("The Letter is Uppercase");
        } else if (a2 >= 97 && a2 <= 122) {
            System.out.println("The Letter is Lowercase");
        } else{
            System.out.println("Invalid Character Detected!!!");
        }

        if(a3 >= 65 && a3 <=90){
            System.out.println("The Letter is Uppercase");
        } else if (a3 >= 97 && a3 <= 122) {
            System.out.println("The Letter is Lowercase");
        } else{
            System.out.println("Invalid Character Detected!!!");
        }

        System.out.println("\n------------Task 5------------\n");

        char char1 = 'B';

        if(65<=char1 && char1 <=122){
            switch (char1){
                case 65:
                case 69:
                case 73:
                case 79:
                case 85:
                case 97:
                case 101:
                case 105:
                case 111:
                case 117:
                    System.out.println("The Letter is Vowel");
                    break;
                default:
                    System.out.println("The Letter is Consonant");
            }
        }else System.out.println("Invalid Character Detected!!!");

        System.out.println("\n------Task 6------");

        char i1 ='8', i2 = '*';

        if((i1 >= 33 && i1 <= 47) || (i1 >= 58 && i1 <= 64)){
            System.out.println("Special Character is = " + i1);
        } else{
            System.out.println("Invalid Character Detected!!!");
        }

        if((i2 >= 33 && i2 <= 47) || (i2 >= 58 && i2 <= 64)){
            System.out.println("Special Character is = " + i2);
        } else{
            System.out.println("Invalid Character Detected!!!");
        }



        System.out.println("\n------------Task 7------------\n");

        char l1 = 'g', l2 = '5', l3 = '@';

        if((l1 >= 65 && l1 <= 90) || (l1 >= 97 && l1 <= 122)) {
            System.out.println("Character is a letter");}

        else if ((l1 >= 33 && l1 <= 47) || (l1 >= 58 && l1 <= 64)){
            System.out.println("Character is a Special Character");
        }
        else{
            System.out.println("Character is a Digit");
        }

        if((l2 >= 65 && l2 <= 90) || (l2 >= 97 && l2 <= 122)) {
            System.out.println("Character is a Letter");}

        else if ((l2 >= 33 && l2 <= 47) || (l2 >= 58 && l2 <= 64)){
            System.out.println("Character is a Special Character");
        }
        else{
            System.out.println("Character is a Digit");
        }

        if((l3 >= 65 && l3 <= 90) || (l3 >= 97 && l3 <= 122)) {
            System.out.println("Character is a Letter");}

        else if ((l3 >= 33 && l3 <= 47) || (l3 >= 58 && l3 <= 64)){
            System.out.println("Character is a Special Character");
        }
        else{
            System.out.println("Character is a Digit");
        }









    }
}
