package A2Z_Sheet.Step4.Lec1;

public class UpperBound {
    static int upperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ind = nums.length;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] <= target){
                ind = mid;
                low = mid + 1;
            } else  {
                high = mid - 1;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        System.out.println(upperBound(arr,2));
    }
}
