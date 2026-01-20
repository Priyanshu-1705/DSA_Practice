package A2Z_Sheet.Step2.Lec1;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
