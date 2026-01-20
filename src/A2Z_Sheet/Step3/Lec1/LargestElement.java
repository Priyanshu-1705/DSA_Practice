package A2Z_Sheet.Step3.Lec1;

public class LargestElement {

    static int largestElement(int[] arr){
        int max = 0;
        for(int val:arr){
            if (val>max) max=val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(largestElement(arr));
    }
}
