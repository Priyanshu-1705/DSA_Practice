package A2Z_Sheet.Step2.Lec2;

import java.util.Arrays;

public class RecursiveInsertion {
    static void recursiveInsertion(int[] array, int n, int i){
        if(i==n) return;
        int j = i;
        while (j>0 && array[j-1] > array[j]){
            int temp = array[j-1];
            array[j-1] = array[j];
            array[j] = temp;
            j--;
        }
        recursiveInsertion(array,n,i+1);
    }

    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        recursiveInsertion(array, array.length, 0);
        System.out.println(Arrays.toString(array));
    }
}
