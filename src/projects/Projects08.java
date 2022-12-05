package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Projects08 {
    public static void main(String[] args) {
        System.out.println("\n----------TASK 1-----------\n");
        int[] nums = {4,8,7,15};
        System.out.println(findClosestDistance(nums));

        System.out.println("\n----------TASK 2-----------\n");
        int[] nums1 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(nums1));

        System.out.println("\n----------TASK 3-----------\n");
        String s = "Hello";
        System.out.println(findFirstUniqueCharacter(s));

        System.out.println("\n----------TASK 4-----------\n");
        int[] nums3 = {2,3,1,5};
        System.out.println(findMissingNumber(nums3));
    }

    //Task 1
    public static int findClosestDistance(int[] nums) {
        int closestDif = Integer.MAX_VALUE;
        if (nums.length < 2) return -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) < closestDif) closestDif = Math.abs(nums[i] - nums[j]);
            }
        }
        return closestDif;
    }

    //Task 2
    public static int findSingleNumber(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int num : nums) {
            nums1.add(num);
        }
        for (int i = 0; i < nums1.size(); i++) {
            Integer num = nums[i];
            nums1.remove(i);
            if (!nums1.contains(num)) {
                return nums[i];
            } else {
                nums1.add(i, num);
            }
        }
        return -1;
    }


    //Task 3
    public static char findFirstUniqueCharacter(String words) {
        ArrayList<Character> words1 = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            words1.add(words.charAt(i));
        }
        for (int i = 0; i < words1.size(); i++) {
            char letter = words1.get(i);
            words1.remove(i);
            if (!words1.contains(letter)) {
                return letter;
            } else {
                words1.add(i, letter);
            }
        }
        return ' ';
    }


    //Task 4
    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + 1 != nums[i + 1]) return nums[i] + 1;

        } return -1;
    }


}









