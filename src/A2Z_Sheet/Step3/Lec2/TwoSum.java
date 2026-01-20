package A2Z_Sheet.Step3.Lec2;
//Ps:1
import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] nums, int target){
        int left = 0 , right = nums.length-1;
        Arrays.sort(nums);
        while (left<right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[]{left,right};
            }
            if (sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
}
