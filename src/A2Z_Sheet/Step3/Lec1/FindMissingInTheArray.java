package A2Z_Sheet.Step3.Lec1;

public class FindMissingInTheArray {
    static int findElement(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        int missing = findElement(arr);
        System.out.println(missing);
    }
}
