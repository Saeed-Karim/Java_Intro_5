package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK1-----\n");
        System.out.println(countWords("      Java is fun       "));

        System.out.println("\n-----TASK2-----\n");
        System.out.println(countA("TechGlobal is a QA bootcamp"));

        System.out.println("\n-----TASK3-----\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(numbers));

        System.out.println("\n-----TASK4-----\n");
        ArrayList<Integer> noDuppies = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(noDuppies));

        System.out.println("\n-----TASK5-----\n");
        ArrayList<String> noDuppiesE = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(noDuppiesE));

        System.out.println("\n-----TASK6-----\n");
        String z = "I     Love     Working    With Samir, He     is   an .. . . . . .  Evil  Genius!!!(sometimes) ";
        System.out.println(removeExtraSpaces(z));

        System.out.println("\n-----TASK7-----\n");
        int[] num1 = {1, 2, 3, 4, 5, 7};
        int[] num2 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(sumOfArrays(num2, num1)));

        System.out.println("\n-----TASK8-----\n");
        int[] num4 = {10, -13, 8, 12, 15, -20};
        System.out.println(findClosestTo10(num4));


    }


    // TASK1
    public static int countWords(String str) {

        return str.trim().split("[ ]+").length;
    }


    // TASK 2
    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') count++;
        }
        return count;
    }

    // Task 3

    public static int countPos(ArrayList<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number > 0) count++;
        }
        return count;
    }

    // TASK 4

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> dups) {

        HashSet<Integer> removeD = new HashSet<>();
        removeD.addAll(dups);
        ArrayList<Integer> noDups = new ArrayList<>();
        noDups.addAll(removeD);
        return noDups;


    }

    // TASK  5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> dupsE) {

        HashSet<String> removeE = new HashSet<>();
        removeE.addAll(dupsE);
        ArrayList<String> noDupsE = new ArrayList<>();
        noDupsE.addAll(removeE);
        return noDupsE;


    }

    // TASK 6
    public static String removeExtraSpaces(String str) {
        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
                continue;
            } else s += str.charAt(i);


        }
        return s;
    }

    // TASK 7
    //public static int[] sumOfArrays(int[] nums1, int[] nums2){}

    public static int[] sumOfArrays(int[] first, int[] second) {
        int[] third = new int[Math.max(first.length, second.length)];
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            third[i] = first[i] + second[i];
        }
        for (int i = Math.min(first.length, second.length); i < third.length; i++) {
            if (first.length > second.length) {
                third[i] = first[i];
            } else {
                third[i] = second[i];
            }

        }
        return third;
    }

    // TASK 8

    public static int findClosestTo10(int[] array){
    int min=0,max=10,nearestNumber;
    int myNumber = 0;
        for(int i = 0; i<array.length; i++){
         if(array[i]<myNumber){
            if( min==0){
                min=array[i];
                } else if(array[i]>min){
                 min=array[i];}
            } else if(array[i]>myNumber) {
                if(max==10) {
                    max=array[i];
                }
                else if(array[i]<max){
                    max=array[i];}
            }
            else
            {
                return array[i];
            }
        } if(Math.abs(myNumber-min)<Math.abs(myNumber-max)){
            nearestNumber=min;
        }
        else
        {
            nearestNumber=max;
        }
        return nearestNumber;
    }
}
























