package A2Z_Sheet.Step3.Lec1;
import java.util.Arrays;

public class RotateArrayByDPlaces {

    //Brute force approach
    static void leftRotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        //copy D elements into temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        //Rotate n-d elements
        for (int i = k; i < n; i++) {
            nums[i- k] = nums[i];
        }
        //put back temp elements
        for (int i = n- k; i < n; i++) {
            nums[i] = temp[i-(n- k)];
        }
    }

    //optimal approach
    static void rotateD(int[] nums, int k, String dir){
        int n = nums.length;
        k = k % n;
        if (dir == "left"){
            // Reverse first k elements
            Reverse(nums, 0, k - 1);
            // Reverse last n-k elements
            Reverse(nums, k , n - 1);
            // Reverse whole array
            Reverse(nums, 0, n - 1);
        }
        else {
            // Reverse first n-k elements
            Reverse(nums, 0, n - k - 1);
            // Reverse last k elements
            Reverse(nums, n - k, n - 1);
            // Reverse whole array
            Reverse(nums, 0, n - 1);
        }

    }
    public static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        leftRotate(arr,2);
        rotateD(arr,3,"right");
        System.out.println(Arrays.toString(arr));
    }
}
