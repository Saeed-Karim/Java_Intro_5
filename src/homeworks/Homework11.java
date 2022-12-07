package homeworks;

import java.time.Year;
import java.util.Arrays;


public class Homework11 {

    public static void main(String[] args) {
        System.out.println("\n-----------Task-1-----------\n");
        String str = "Tech Global";
        System.out.println(noSpace(str));

        System.out.println("\n-----------Task-2-----------\n");
        str = "Tech Global";
        System.out.println(replaceFirstLast(str));

        System.out.println("\n-----------Task-3-----------\n");
        str = "Java";
        System.out.println(hasVowel(str));
        str = "Lynch";
        System.out.println(hasVowel(str));

        System.out.println("\n-----------Task-4-----------\n");
        int age = 2006;
        System.out.println(checkAge(age));

        System.out.println("\n-----------Task-5-----------\n");
        int a = 0, b = 0, c = 6;
        System.out.println(averageOfEdges(a, b, c));


        System.out.println("\n-----------Task-6-----------\n");
        String[] string = new String[]{"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(string)));


        System.out.println("\n-----------Task-7-----------\n");

        int[] nums = new int[]{7, 4, 11, 23, 17};
        System.out.println(Arrays.toString(no3or5(nums)));


        System.out.println("\n-----------Task-8-----------\n");

        nums = new int[]{-10, -3, 0, 1};
        System.out.println(countPrimes(nums));


    }

   //Task 1
    public static String noSpace(String str){
        return str.replaceAll(" ", "");
    }


    // Task 2
    public static String replaceFirstLast(String str){
        str = str.trim();
        if (str.length() > 1) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() -1);
            return "" + lastChar + str.substring(1, str.length() -1) + firstChar;
        }
        return "";
    }

    // Task 3
    public static boolean hasVowel(String str){
        str = str.toLowerCase();
        return str.contains("a") || str.contains("e") || str.contains("o") || str.contains("u") || str.contains("i");
    }

    // Task 4
    public static String checkAge(int age){
        int year = Year.now().getValue();
        if(age > year || year - age > 100) return "AGE IS NOT VALID";
        else if(year - age < 16) return "AGE IS NOT ALLOWED";
        return "AGE IS ALLOWED";
    }

    // Task 5
    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    // Task 6
    public static String[] noA(String[] arr){
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().startsWith("a")) result[i] = "###";
            else result[i] = arr[i];
        }
        return result;
    }

    //  Task 7
    public static int[] no3or5(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 15 == 0) result[i] = 101;
            else if(nums[i] % 5 == 0) result[i] = 99;
            else if(nums[i] % 3 == 0) result[i] = 100;
            else result[i] = nums[i];
        }
        return result;
    }

    //  Task 8
    public static int countPrimes(int[] nums){
        return (int)Arrays.stream(Arrays.stream(nums).toArray()).filter(
                n -> n == 2 || n == 3 || n != 1 && n % 2 != 0 && n % 3 != 0
        ).count();
    }


}