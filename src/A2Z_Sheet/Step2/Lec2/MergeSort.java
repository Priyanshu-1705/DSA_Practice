package A2Z_Sheet.Step2.Lec2;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    static void  mergeSort(int[] array,int low,int high){
        if (low>=high) return;
        int mid =(low+high)/2;
        //Dividing array into two halfs using indices
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        //now merge and sort
        merge(array,low,mid,high);
    }
    static void merge(int[] array,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>(); // storing sorted elements temp
        int left = low;
        int right = mid+1;
        //sort the array
        while (left<=mid&&right<=high) {
            if (array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }
        //agar left me elements reh gaye ha toh
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }
        //agar right me elements reh gaye ha toh
        while (right <= high) {
            temp.add(array[right]);
            right++;
        }
        //copy sorted elements from temp to original array
        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,6,7};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
