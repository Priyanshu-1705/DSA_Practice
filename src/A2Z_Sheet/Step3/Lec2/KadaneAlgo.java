package A2Z_Sheet.Step3.Lec2;
//Ps:53
public class KadaneAlgo {
    static int kadane(int[] nums){
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
//        int ansStart=-1;
//        int ansEnd=-1;
//        int start=0;
        for (int i = 0; i < nums.length; i++) {
//            if (currSum==0) {
//                start = i;
//            }
            currSum+=nums[i];
            if (currSum>maxSum){
                maxSum = currSum;
//                ansStart = start;
//                ansEnd = i;
            }
            if (currSum<0) currSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, -7, -2, -10, -4};
        System.out.println(kadane(nums));
    }
}
