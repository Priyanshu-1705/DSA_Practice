package A2Z_Sheet.Step3.Lec1;
//LeetCode 26
public class RemoveDuplicates {
    static int removeDuplicate(int[] arr){
        //My Solution
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] == arr[i]){
//                    arr[j] = 0;
//                }
//                if(arr[i]==0&&arr[j]!=0){
//                    arr[i] = arr[j];
//                    arr[j] = 0;
//                }
//            }
//        }
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0)  {
//                k = i;
//                break;
//            }
//        }
//        return k;

        //Optimal Solution
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int [] arr ={1,1,2,2,2,3,3};
        int k = removeDuplicate(arr);
        System.out.println(k);
    }
}
