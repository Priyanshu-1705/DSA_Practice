package A2Z_Sheet.Step2.Lec1;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { //iterate through the array
            int min = i; // assume at i index element is min
            for (int j = i; j < arr.length; j++) { //iterate through the i to n-1 array
                if (arr[j] < arr[min]){ //check is j is min or not
                    min = j;
                }
            }
            int temp = arr[i];  // swap min element at index i to min
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
