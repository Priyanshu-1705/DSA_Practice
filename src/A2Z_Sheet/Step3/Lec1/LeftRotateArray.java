package A2Z_Sheet.Step3.Lec1;

import java.util.Arrays;

public class LeftRotateArray {
    static void leftRotate(int[] arr){
        int n = arr.length;
        int first;
        if (n==0) return;
        else first = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        for (int i = 0; i < k ; i++) {
            leftRotate(arr);
        }

        System.out.println(Arrays.toString(arr));
    }
}
