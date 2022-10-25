package mathClass;

public class MathRandomMethod {
    public static void main(String[] args) {

       // System.out.println("Random number is " + Math.random());

        double myRandom = Math.random();
        double myRandomBetween0to10 = (int) (Math.random() * 7);
        int myDice = (int) (Math.random() * 6) + 1;


        /*
        randomNumber * (big point - small point + 1) + start
         */

        // 50-100

        int myRandomBetween50to100 = (int) (Math.random() * (100 - 50 + 1) + 50);


        System.out.println("Random number is " + Math.random());
        System.out.println(" myRandomBetween0to10 = " + myRandomBetween0to10);
        System.out.println(" My Dice rolled = " + myDice);

        System.out.println("Random number between 50 to 100 is = " + myRandomBetween50to100);

        // Create a random number between 20 and 40 and print it

        int myRandomBetween20to40 = (int) (Math.random() * (40 - 20 + 1) + 20);
        System.out.println("Random number between 20 and 40 = " + myRandomBetween20to40);




    }
}
