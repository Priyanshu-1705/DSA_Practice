package A2Z_Sheet.Step4.Lec1;
//Ps:540
public class SearchSingleElement {
    static int searchElement(int[] nums){
        //brute Force
//        if (nums.length == 1) return nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0){
//                if (nums[i] != nums[i+1]) return nums[0];
//            } else if (i == nums.length-1) {
//                if (nums[i] != nums[i-1]) return nums[i];
//            } else if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) {
//                return nums[i];
//            }
//        }
        
        
        //Optimal approach
        int n = nums.length-1;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n] != nums[n-1]) return nums[n];

        int low = 1;
        int high = n-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) return nums[mid];
            else if ((mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid-1] == nums[mid])) {
                low = mid + 1;
            }else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(searchElement(arr));
    }
}
