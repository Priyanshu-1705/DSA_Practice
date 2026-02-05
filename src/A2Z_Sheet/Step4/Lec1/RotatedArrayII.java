package A2Z_Sheet.Step4.Lec1;
//Ps:81
public class RotatedArrayII {
    static boolean searchII(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            // If left part is sorted
            if (nums[low] <= nums[mid]) {
                // If target lies within sorted left part
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                // Else, search in right half
                else {
                    low = mid + 1;
                }
            }
            // Else, right part is sorted
            else {
                // If target lies within sorted right part
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                // Else, search in left half
                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchII(arr,3));
    }
}
