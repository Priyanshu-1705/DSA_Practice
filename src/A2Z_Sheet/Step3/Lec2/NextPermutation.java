package A2Z_Sheet.Step3.Lec2;

import java.util.Arrays;

public class NextPermutation {
    static void nextPermutation(int[] nums){
        int n = nums.length;
        int index = -1;
        //for finding the break point where the element gets small
        for (int i = n-2; i >= 0; i--) {
            if (nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        //
        if (index == -1) {
            reverse(nums,0,n-1);
            return;
        }

        //
        for (int i = n-1; i > index ; i--) {
            if (nums[i] > nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        //
        reverse(nums,index+1,n-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while (start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
