package A2Z_Sheet.Step4.Lec1;
//Ps:33

public class RotatedArrayI {
    static int searchI(int[] nums, int target){
        //Brute force
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) return i;
//        }
//        return -1;

        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                return mid;
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
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(searchI(nums,0));
    }
}
