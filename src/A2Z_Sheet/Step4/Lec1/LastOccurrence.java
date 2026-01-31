package A2Z_Sheet.Step4.Lec1;
import java.util.Arrays;
//Ps:34

public class LastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;          // possible answer
                high = mid - 1;     // move left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;          // possible answer
                low = mid + 1;      // move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }



    static int findLastOccurrence(int[] nums, int target){
        //Brute force
//        for (int i = nums.length-1; i >= 0; i--) {
//            if (nums[i] == target) return i;
//        }
//        return -1;

        //optimal approach
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int array[] = {3, 4, 13, 13, 13, 20, 40};
        LastOccurrence obj = new LastOccurrence();
        int[] ans =obj.searchRange(array,13);
        System.out.println(Arrays.toString(ans));
    }
}
