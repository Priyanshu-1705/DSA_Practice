package A2Z_Sheet.Step3.Lec1;

public class SecondLarSmall {
    static int secondLargest(int[] arr){
        if (arr.length==1) return -1;

       //Better Approach o(2N)
//        int max = 0;
//        for(int val:arr){
//            if (val>max) max=val;
//        }
//        int sL = -1;
//        int j = 0;
//        while (j<arr.length){
//            if (arr[j]<max && arr[j]>sL ){
//                    sL = arr[j];
//            }
//            j++;
//        }

        //Optimal Approach O(N)
        int sL = -1;
        int lar = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>lar){
                sL = lar;
                lar = arr[i];
            } else if (arr[i]<lar && arr[i]>sL) {
                sL = arr[i];
            }
        }
        return sL;
    }
    static int secondSmallest(int[] arr){
        if (arr.length==1) return -1;
        int sS = arr[0];
        int min = 0;
        //Better Approach
//        for(int val:arr){
//            if (val< min) min =val;
//        }
//        int j = 0;
//        while (j<arr.length){
//            if (arr[j] > min && arr[j] < sS){
//                    sS = arr[j];
//            }
//            j++;
//        }

        //Optimal solution
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                sS = min;
                min = arr[i];
            }
            else if (arr[i] < sS && arr[i] != min)
            {
                sS = arr[i];
            }
        }
        return sS;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }
}
