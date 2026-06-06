package A2Z_Sheet.Step9.Lec3;
//Ps:503

import java.util.*;

public class NextGreaterElementII {
    static int[] nextGreaterElements(int[] nums) {
        //brute force
//        int[] nge = new int[nums.length];
//        Arrays.fill(nge,-1);
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < i + nums.length; j++) {
//                int ind = j % nums.length;
//                if (nums[i] < nums[ind]){
//                    nge[i] = nums[ind];
//                    break;
//                }
//            }
//        }
//        return nge;

        //Optimal
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                nge[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i % n]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
}
