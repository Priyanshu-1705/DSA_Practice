package A2Z_Sheet.Step4.Lec1;
//Ps:162
public class PeakElement {
    static int findPeek(int[] nums){
        //Brute Force
//        int n = nums.length;
        // Traverse the array
//        for (int i = 0; i < n; i++) {
            // Check left neighbor if exists
//            boolean left = (i == 0) || (nums[i] >= nums[i - 1]);
            // Check right neighbor if exists
//            boolean right = (i == n - 1) || (nums[i] >= nums[i + 1]);
            // If both conditions are true
//            if (left && right) return i;
//        }
        // In case no peak found
//        return -1;

        //Optimal approach
        //If there is only one peak
//        int n = nums.length-1;
//        if (n == 1) return nums[0];
//        int low = 1;
//        int high = n-1;
//        while (low<=high){
//            if (nums[0] > nums[1]) return nums[0];
//            if (nums[n-1]<nums[n]) return nums[n];
//            int mid = low + (high-low)/2;
//            if (nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
//                return nums[mid];
//            } else if (nums[low] < nums[mid]) {
//                low = mid + 1;
//            }else if (nums[mid] < nums[mid+1]) {
//                high = mid - 1;
//            }
//        }
//        return -1;
        //If there is multiple peaks
        int n = nums.length-1;
        if (n == 1) return nums[0];
        int low = 1;
        int high = n-1;
        while (low<=high){
            if (nums[0] > nums[1]) return nums[0];
            if (nums[n-1]<nums[n]) return nums[n];
            int mid = low + (high-low)/2;
            if (nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
                return nums[mid];
            } else if (nums[mid-1] < nums[mid]) {
                low = mid + 1;
            }else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(findPeek(arr));
    }
}
