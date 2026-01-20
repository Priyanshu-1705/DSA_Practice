package A2Z_Sheet.Step2.Lec2;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int partition = part(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }
    static int part(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j){
            while (arr[i]<=pivot&&i<=high){
                i++;
            }
            while (arr[j]>pivot&&j>=low){
                j--;
            }
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
