package A2Z_Sheet.Step1.Lec5;

import java.util.Arrays;

public class ReverseArray {
    static void reverse(int i, int[] arr){
        if (i>=arr.length/2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse(i+1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Original array " +Arrays.toString(arr));
        reverse(0,arr);
        System.out.println("Reversed array " +Arrays.toString(arr));
    }
}
