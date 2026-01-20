package A2Z_Sheet.Step3.Lec1;

import java.util.*;

public class LongestSubArrayGivenSum {
    static int longestSubArrayGivenSum(int[] arr,int k){

        //Brute Force
//        int n = nums.length;
//        int maxLength = 0;
//
//        // starting index
//        for (int startIndex = 0; startIndex < n; startIndex++) {
//            // ending index
//            for (int endIndex = startIndex; endIndex < n; endIndex++) {
//
//                /* add all the elements of
//                   subarray = nums[startIndex...endIndex] */
//                int currentSum = 0;
//                for (int i = startIndex; i <= endIndex; i++) {
//                    currentSum += nums[i];
//                }
//
//                if (currentSum == k) {
//                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
//                }
//            }
//        }
//        return maxLength;

        //Optimal approach but valid only for positive integer
//        int n = arr.length;
//        // To store the maximum length of the sub-array
//        int maxLen = 0;
//        // Pointers for sliding window
//        int left = 0, right = 0;
//        // Sum of the current window
//        int sum = arr[0];
//        // Traverse through the array
//        while (right < n) {
//            // Shrink the window if sum exceeds k
//            while (left <= right && sum > k) {
//                sum -= arr[left];
//                left++;
//            }
//            // Update max length if sum equals k
//            if (sum == k) {
//                maxLen = Math.max(maxLen, right - left + 1);
//            }
//            // Expand the window to the right
//            right++;
//            if (right < n) {
//                sum += arr[right];
//            }
//        }
//        return maxLen;

        //Optimal Approach for both approach
        int n = arr.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0;       // Running sum
        int maxLen = 0;    // Longest subarray length
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Update running prefix sum
            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }
            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }
            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 2, 1};
        System.out.println(longestSubArrayGivenSum(arr,6));
    }
}
