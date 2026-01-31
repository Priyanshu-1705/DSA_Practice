package A2Z_Sheet.Step4.Lec1;

public class FindOccurrence {
    static int findOccurrence(int[] nums, int target){
        //Brute force
//        int ans = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target){
//                ans++;
//            }
//        }
//        return ans;

        //Optimal approach
        int n = nums.length;
        int first = firstOccurrence(nums, n, target);
        int last = lastOccurrence(nums, n, target);
        if (first == -1) return 0;
        return last - first + 1;
    }
    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }
    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int array[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        System.out.println(findOccurrence(array,3));
    }
}
