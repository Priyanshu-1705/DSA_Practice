package A2Z_Sheet.Step3.Lec1;

import java.util.Arrays;

public class MoveZerosToLast {
    static void moveZeroToLast(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i<=j){
            if (arr[i] == 0 && arr[j] != 0){
                arr[i] = arr[j];
                arr[j] = 0;
                i++;
                j--;
            } else if (arr[i]!=0) {
                i++;
            } else if (arr[j] == 0) {
                j--;
            }
        }
    }
    //order had to same for non zero elements
    static void zeroToLast(int[] nums){
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j+1; i < nums.length ; i++) {
            if (nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,4,0,6,0,0};
        moveZeroToLast(arr);
//        zeroToLast(arr);
        System.out.println(Arrays.toString(arr));
    }
}
