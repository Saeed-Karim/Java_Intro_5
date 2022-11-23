package homeworks;

import java.util.ArrayList;
import java.util.Arrays;


public class Homework09 {
    public static void main(String[] args) {


        System.out.println("\n-----------TASK 1-----------\n");
        String repeaters = "There is no duplicates";
        int numbers[] = {-4, 0, -7, 9, 5, 10, 89, 45};
        loop:
        {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        repeaters = String.valueOf(numbers[i]);
                        break loop;
                    }
                }
            }
        }
        System.out.println(repeaters);


      System.out.println("\n-----------TASK 2-----------\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
        String duplicate = "There is no duplicates";
       loop1:
        {
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                   if (words[i].equalsIgnoreCase(words[j])){
                       duplicate = words[i];
                       break loop1;
                   }
                }
           }
       }
        System.out.println(duplicate);


        System.out.println("\n-----------TASK 3-----------\n");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        int[] nums = {-4, 0, -7, 0, 5, 10, -7, 0};
        loop1:
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        numbers1.add(nums[i]);
                    }
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

        System.out.println("\n-----------TASK 4-----------\n");

        ArrayList<String> strSet = new ArrayList<>();
        String[] wordz = {"A", "foo", "12", "Foo", "bar", "a", "a" };
        loop1:
        {
            for (int i = 0; i < wordz.length; i++) {
                for (int j = i + 1; j < wordz.length; j++) {
                    if (wordz[i].equalsIgnoreCase(wordz[j])){
                        strSet.add(wordz[i]);
                    }
                }
            }
        }
        if(strSet.size() == 0) System.out.println("There is no duplicates");
        else{
            for (String word: strSet) {
                System.out.println(Arrays.toString(wordz));
            }
        }


        System.out.println("\n-----------TASK 5-----------\n");

        String[] word = {"abc","foo","bar", "arkansas", "iowa", "alabama", "elliot"};
        String[] words1 = new String[word.length];
        for (int i = word.length - 1; i >= 0; i--) {
            words1[word.length - 1 - i] = word[i];
        }
        System.out.println(Arrays.toString(words1));



        System.out.println("\n-----------TASK 6-----------\n");

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