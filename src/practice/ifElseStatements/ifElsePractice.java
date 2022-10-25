package practice.ifElseStatements;

public class ifElsePractice {
    public static void main(String[] args) {


       int myInt = 45;


    //    if(myInt >= 0 && myInt <= 24){
      //      System.out.println("First Quarter");
     //   }
 //       else if(myInt <=49){
       //     System.out.println("Second Quarter");
     //   }
     //   else if(myInt >= 50 && myInt <= 74){
        //    System.out.println("Third Quarter");
       // }


        if (myInt <= -1 && myInt >= -50){
            System.out.println("number is in negative part");

        }
            else if (myInt == 0){
            System.out.println("number is zero");

        }
            else if(myInt > 0 && myInt <= 50){
            System.out.println("number is in positive part");

        }







    }
}
