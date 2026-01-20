package A2Z_Sheet.Step3.Lec2;
//Ps:121
public class StockBuyAndSell {
    static int getProfit(int[] nums){
        if (nums == null || nums.length == 0) return 0;

        //Brute force
//        int profit = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            int currProfit = 0;
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]<nums[j]){
//                    currProfit = nums[j]-nums[i];
//                }
//                profit = Math.max(profit,currProfit);
//            }
//        }
//        return profit;


        //Optimal Approach
        int max = 0;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min>nums[i]) min=nums[i];
            int profit = nums[i] - min;
            max = Math.max(max,profit);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(getProfit(prices));
    }
}
