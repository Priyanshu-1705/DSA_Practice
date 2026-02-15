package A2Z_Sheet.Step4.Lec2;
//Ps:1482
public class RoseBouquet {
    static int findDays(int[] bloomDay, int N, int k, int m){
        if (N<k*m) return -1;

        //Brute force
//        int start = Integer.MAX_VALUE;
//        int end = 0;
//        for (int i: nums){
//            start = Math.min(start,i);
//            end = Math.max(end,i);
//        }
//        int ans = start;
//        for (int i = start; i <= end; i++) {
//            if (isPossible(nums, i, k, m)){
//                ans = i;
//                return ans;
//            }
//        }
//        return -1;

        //Optimal approach
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int i: bloomDay){
            low = Math.min(low,i);
            high = Math.max(high,i);
        }
        int ans = -1;
        while (low<=high){
            int mid = (high+low)/2;
            if (isPossible(bloomDay, mid, k, m)){
                ans = mid;
                high = mid -1;
            }else low = mid + 1;
        }
        return ans;
    }
    private static boolean isPossible(int[] arr, int minDays, int k, int m){
        int count = 0;
        int bouquet = 0;
        for (int i: arr){
            if (i<=minDays){
                count++;
                if (count == k){
                    bouquet++;
                    count = 0;
                }
            }else count = 0;
        }
        return bouquet >= m;
    }

    public static void main(String[] args) {
        int N = 8;
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int bouquets = 2;
        int adjacentRoses = 3;
        System.out.println(findDays(bloomDays, N, bouquets, adjacentRoses));
    }
}
