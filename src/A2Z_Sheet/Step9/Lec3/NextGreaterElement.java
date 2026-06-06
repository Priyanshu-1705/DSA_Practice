package A2Z_Sheet.Step9.Lec3;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    static int[] findNGE(int[] arr){
        //Brute force
//        int[] nge = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    nge[i] = arr[j];
//                    break;
//                } else nge[i] = -1;
//            }
//        }
//        nge[arr.length - 1] = -1;
//        return nge;

        //Optimal approach
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() || stack.peek() <= arr[i]){
                stack.pop();
            }
            if (!stack.empty()){
                nge[i] = stack.peek();
            }else {
                nge[i] = -1;
            }
            stack.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {6,0,8,1,3};
        System.out.println(Arrays.toString(findNGE(arr)));
    }
}
