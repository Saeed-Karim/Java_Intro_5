package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Projects06 {
    public static void main(String[] args) {


        System.out.println("\n-----------TASK 1-----------\n");
        String[] str = {"Hi Saeed", "I love Java", " Suayip",  " "};
        countMultipleWords(str);


        System.out.println("\n-----------TASK 2-----------\n");
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,-4,-5,6,-7,-8));
        removeNegatives(nums1);

        System.out.println("\n-----------TASK 3-----------\n");
        validatePassword("Saeed@123");

        System.out.println("\n-----------TASK 4-----------\n");
        System.out.println(emailIsValid("JavaIsGr8!@school.com"));






    }


    public static void countMultipleWords(String[] arrayName) {

        //TASK 1
        int count = 0;
        for (String words : arrayName) {
            for (int i = 1; i < words.length() -1 ; i++) {
                if (words.charAt(i) == ' ' & Character.isLetter(words.charAt(i - 1)) & Character.isLetter(words.charAt(i + 1))){
                    count++;
                    break;
            }

            }
        }
        System.out.println(count);
    }
    //TASK 2
    public static void removeNegatives(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0 ){
                nums.remove(nums.get(i));
                i--;
            }

        }
        System.out.println(nums);

    }

    //TASK 3
    public static void validatePassword(String str){

        if (str.length() >= 8 && str.length() <= 16){
            int countDigit = 0, countUpper = 0, countLower = 0, countSpecial = 0;
            for (int i = 0; i < str.length(); i++){
                if (Character.isUpperCase(str.charAt(i))){
                    countUpper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                } else if (Character.isDigit(str.charAt(i))) {
                    countDigit++;
                } else if (str.charAt(i) != ' '){
                    countSpecial++;
                }
            }if (countLower > 0 & countUpper > 0 & countDigit > 0 & countSpecial > 0){
                System.out.println(true);
            }else System.out.println(false);
        }
    }
    //TASK 4

    public static boolean emailIsValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


        }







