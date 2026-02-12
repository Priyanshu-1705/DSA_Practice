package A2Z_Sheet.Step4.Lec2;
//Ps:1283
public class SmallestDivisor {
    static int findSmallestDivisor(int[] nums, int threshold){
        if (nums.length == 1) return nums[0];

        //Brute force
//        int start = Integer.MAX_VALUE;
//        int end = 0;
//        for (int i: nums){
//            start = Math.min(start,i);
//            end = Math.max(end,i);
//        }
//        for (int i = start; i <= end; i++) {
//            if (isPossible(nums,i,threshold)){
//                return i;
//            }
//        }
//        return -1;

        //Optimal approach
        int low = 1 ;
        int high = 0;
        for (int i: nums){
            low = Math.min(low,i);
            high = Math.max(high,i);
        }
        int ans = -1;
        while (low<=high){
            int mid = (high+low)/2;
            if (isPossible(nums, mid, threshold)){
                ans = mid;
                high = mid -1;
            }else low = mid + 1;
        }
        return ans;
    }
    private static boolean isPossible(int[] nums, int divisor, int threshold){
        int sum = 0;
        for (int num: nums){
            sum+=(num + divisor -1)/divisor;
        }
        return sum<=threshold;
    }

    public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int threshold = 10;
        System.out.println(findSmallestDivisor(arr,threshold));
    }
}
