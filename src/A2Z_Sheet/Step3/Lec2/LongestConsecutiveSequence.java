package A2Z_Sheet.Step3.Lec2;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static int getSequence(int[] nums){
        if (nums.length == 0) return 0;

        //Brute Force
//        int longest = 1;
//        for (int i = 0; i < nums.length; i++) {
//            int x = nums[i];
//            int count = 1;
//            while (linearSearch(nums,x+1) == true){
//                x++;
//                count++;
//            }
//            longest = Math.max(longest,count);
//        }
//      return longest;

        //Better approach
        Arrays.sort(nums);
        int curr = 0,lastSmaller = Integer.MIN_VALUE,longest = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]-1 == lastSmaller){
                curr++;
                lastSmaller = nums[i];
            } else if (nums[i]!=lastSmaller) {
                curr = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest,curr);
        }
        return longest;

        //Optimal approach
//        int longest = 1;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }


    }

    private static boolean linearSearch(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(getSequence(nums));
    }
}
