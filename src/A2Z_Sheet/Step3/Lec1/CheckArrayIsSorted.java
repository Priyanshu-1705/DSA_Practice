package A2Z_Sheet.Step3.Lec1;

public class CheckArrayIsSorted {
    static boolean isArraySorted(int[] arr){
        boolean asc = true;
        boolean des = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]<=arr[i+1]){
                asc = false;
            }
            if (arr[i]>=arr[i+1]) {
                des = false;
            }
        }
        return asc || des;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        System.out.println(isArraySorted(arr));
    }
}
