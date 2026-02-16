package A2Z_Sheet.Step4.Lec2;
//Ps:1011
public class ShipPackages {
    static int shipWithinDays(int[] weights, int days) {
        //Brute force
//        int low = Integer.MAX_VALUE;
//        int high = 0;
//        for (int weight : weights){
//            low = Math.min(low, weight);
//            high += weight;
//        }
//        for (int i = low; i<= high; i++){
//            if (isPossible(weights, i, days)){
//                return i;
//            }
//        }
//        return -1;

        //Optimal approach
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int weight : weights){
            low = Math.min(low, weight);
            high += weight;
        }
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (isPossible(weights, mid, days)){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
    private static boolean isPossible(int[] weights, int capacity, int days) {
        int dayCount = 1;   // start with day 1
        int currentLoad = 0;

        for (int weight : weights) {
            // If a single package is heavier than capacity → impossible
            if (weight > capacity) return false;
            // If adding this package exceeds capacity → new day
            if (currentLoad + weight > capacity) {
                dayCount++;
                currentLoad = weight;
            }
            // Otherwise keep loading
            else {
                currentLoad += weight;
            }
        }
        return dayCount <= days;
    }


    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int days = 2;
        System.out.println(shipWithinDays(weights,days));
    }
}
