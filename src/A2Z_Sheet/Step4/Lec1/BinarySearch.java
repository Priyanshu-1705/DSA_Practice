package A2Z_Sheet.Step4.Lec1;
//Ps:704
public class BinarySearch {
    //Iterative approach
//    static int search(int[] nums, int target){
//        int low = 0;
//        int high = nums.length-1;
//        while (low<=high){
//            int mid = low + (high-low)/2;
//            if (nums[mid] == target){
//                return mid;
//            } else if (nums[mid]< target) {
//                low = mid + 1;
//            }else high = mid - 1;
//        }
//        return -1;
//    }

    //recursive approach
    static int search(int[] nums, int target, int low, int high){
        if (low>high) return -1;
        int mid = low + (high-low)/2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return search(nums,target,low,mid-1);
        else return search(nums,target,mid+1,high);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        System.out.println(search(a,6, 0, a.length-1));
    }
}
