package A2Z_Sheet.Step4.Lec1;

public class FindRotation {
    static int findRotation(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while (low<high){
            int mid = low + (high-low)/2;
            //right side sorted, pivot present in left side
            if (nums[mid]<nums[high]){
                high = mid - 1;
            }
            //Left side sorted, pivot present in right side
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findRotation(nums));
    }
}
