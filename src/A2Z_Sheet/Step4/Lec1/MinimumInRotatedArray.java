package A2Z_Sheet.Step4.Lec1;
//Ps:153
public class MinimumInRotatedArray {
    static int findMinimum(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while (low<high){
            int mid = low + (high-low)/2;
            //right side sorted, minimum present in left side
            if (nums[mid]<nums[high]){
                high = mid - 1;
            }
            //Left side sorted, minimum present in right side
            else {
                low = mid + 1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMinimum(nums));
    }
}
