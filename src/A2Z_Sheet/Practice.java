package A2Z_Sheet;

import java.util.Arrays;

public class Practice {

     static public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int cost = nums[0] + nums[1] + nums[2];
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {10,3,1,1};
        System.out.println(minimumCost(arr));

    }
}
