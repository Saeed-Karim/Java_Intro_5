package string_methods;

import utilities.ScannerHelper;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name
        Print first char of the name with message "First character in the name is = "
        Print last char of the name with message "Last character in the name is = "

        John - length() -1
        First character in the name is = J
        Last character in the name is = n

        Jessie - length() -1
        First character in the name is = J
        Last character in the name is = e

        s.charAt(0)
        s.charAt(s.length()-1)
        */

        String s1 = ScannerHelper.getAName();
        System.out.println("First Character in your name is = " + s1.charAt(0));
        System.out.println("Last Character in your name is = " + s1.charAt(s1.length()-1));





    }

}
