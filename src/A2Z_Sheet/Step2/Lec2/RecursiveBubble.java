package A2Z_Sheet.Step2.Lec2;

import java.util.Arrays;

public class RecursiveBubble {
    static void recursiveBubble(int[] arr,int n){
        if (n==1) return;
        for (int i = 0; i <= n - 2; i++) {
            if(arr[i]>arr[i+1]){
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
            }
        }
        recursiveBubble(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        recursiveBubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

