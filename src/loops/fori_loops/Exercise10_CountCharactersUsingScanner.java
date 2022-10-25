package loops.fori_loops;

import utilities.ScannerHelper;

import java.sql.SQLOutput;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        /*
        Ask user to enter a name
        and count how many "L" letters exist

        Lionel -- > 2
        Leo --> 1
        Lucy --> 1

         */

        String name = ScannerHelper.getAName();

        int countL = 0;

        for (int i = 0; i <= name.length() - 1; i++) {
           if (name.charAt(i) == 'l' || name.charAt(i) == 'L') countL++;

        }

        System.out.println(countL);

        // (name.toLowerCase().charAt(i) == 'l') countL++;
        //(name.toUpperCase().charAt(i) == 'L') countL++;




        }

    }

