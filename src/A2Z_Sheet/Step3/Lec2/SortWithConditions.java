package A2Z_Sheet.Step3.Lec2;

import java.util.Arrays;


public class SortWithConditions {
    static void sortWithCondition(int[] arr){
        //Brute Force
//        int zeros=0,ones=0,twos=0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i]==0) zeros++;
//            else if (arr[i]==1) ones++;
//            else twos++;
//        }
//       int i = 0;
//        while (zeros-- >0){
//            arr[i++]=0;
//        }
//        while (ones-- >0){
//            arr[i++]=1;
//        }
//        while (twos-- >0){
//            arr[i++]=2;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (zeros!=0){
//                arr[i] = 0;
//                zeros--;
//                continue;
//            }
//            if (ones!=0){
//                arr[i] = 1;
//                ones--;
//                continue;
//            }
//            if (twos!=0){
//                arr[i] = 2;
//                twos--;
//            }
//        }
        
        //Optimal approach - Dutch National Flag algo
        int low = 0,mid=0;
        int high = arr.length-1;
        while (mid<=high){
            if (arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }else if (arr[mid]==1){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr,int low, int mid) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={1, 0, 2, 1, 0};
        sortWithCondition(arr);
        System.out.println(Arrays.toString(arr));
    }
}
