package homeworks;

import java.util.ArrayList;
import java.util.Arrays;


public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n-----TASK1-----\n");

        String firstDuplicated  = "There is no duplicates";
        int numbers[] = {-4, 0, -7, 9, 5, 10, 89, 45};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    firstDuplicated = String.valueOf(numbers[i]);
                    break;
                }
            }
        }
        System.out.println(firstDuplicated);


        System.out.println("\n-----TASK2-----\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
        String duplicate = "There is no duplicates";
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])){
                    duplicate = words[i];
                    break;
                }
            }
        }
        System.out.println(duplicate);


        System.out.println("\n-----TASK3-----\n"); //ASK IN RECAP

        ArrayList<Integer> numbers1 = new ArrayList<>();
        int nums1 [] = {-4, 0, -7, 0, 5, 10, -7, 0};
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] == nums1[j]) {
                    numbers1.add(nums1[i]);
                }
            }
        }
        if(numbers1.size() == 0) System.out.println("There is no duplicates");
        else{
            for (int num:
                    numbers) {
                System.out.println(num);
            }
        }

        System.out.println("\n-----TASK4-----\n");

        ArrayList<String> strSet = new ArrayList<>();
        String[] words1 = {"A", "foo", "12", "Foo", "bar", "a", "a" };
        for (int i = 0; i < words1.length; i++) {
            for (int j = i + 1; j < words1.length; j++) {
                if (words1[i].equalsIgnoreCase(words1[j])){
                    strSet.add(words1[i]);
                }
            }
        }
        if(strSet.size() == 0) System.out.println("There is no duplicates");
        else{
            for (String word: strSet) {
                System.out.println(Arrays.toString(words1));
            }
        }

        System.out.println("\n-----TASK5-----\n");

        String[] word2 = {"abc","foo","bar", "arkansas", "iowa", "alabama", "elliot"};
        String[] w1 = new String[word2.length];
        for (int i = word2.length - 1; i >= 0; i--) {
            w1[word2.length - 1 - i] = word2[i];
        }
        System.out.println(Arrays.toString(w1));

        System.out.println("\n-----------TASK 6-----------\n"); // ASK IN RECAP

        String d = "Java is fun", temp, finalStr = "";
        String[] str4 = d.split(" ");
        for (String s: str4) {
            temp = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                temp += s.charAt(i);
            }
            finalStr += temp + " ";
        }
        System.out.println(finalStr.substring(0, finalStr.length() - 1));

    }
}