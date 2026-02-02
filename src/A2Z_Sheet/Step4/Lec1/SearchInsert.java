package A2Z_Sheet.Step4.Lec1;
//Ps:35
public class SearchInsert {
    static int insert(int[] nums, int x){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while (low<=high){
            int mid = low + (high-low)/2;
          //middle element is greater or equal to x,
          //so it might be an answer. Now,
          //we check that any other greater number is present or not in left side
            if (nums[mid]>=x){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        System.out.println(insert(arr,x));
    }
}
