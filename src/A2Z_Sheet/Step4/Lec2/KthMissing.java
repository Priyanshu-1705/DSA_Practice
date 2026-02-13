package A2Z_Sheet.Step4.Lec2;
//Ps:1539
public class KthMissing {
    static int findKthPositive(int[] arr, int k) {
        //Brute force
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= k) k++;
//            else break;
//        }
//        return k;

        //Optimal approach
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if (missing<k) low = mid + 1;
            else high = mid - 1;
        }
        return high+k+1;
    }


    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;
        System.out.println(findKthPositive(arr,k));
    }
}
