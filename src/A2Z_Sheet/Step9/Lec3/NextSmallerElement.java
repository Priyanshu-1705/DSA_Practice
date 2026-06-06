package A2Z_Sheet.Step9.Lec3;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    static int[] nextSmallerElement(int[] nums){
        //Brute force
//        int[] nge = new int[nums.length];
//        Arrays.fill(nge,-1);
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[j] < nums[i]){
//                    nge[i] = nums[j];
//                    break;
//                }
//            }
//        }
//        return nge;

        //Optimal

        int[] nge = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]){
                stack.pop();
            }
            if (!stack.empty()){
                nge[i] = stack.peek();
            }else {
                nge[i] = -1;
            }
            stack.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmallerElement(nums)));
    }
}
