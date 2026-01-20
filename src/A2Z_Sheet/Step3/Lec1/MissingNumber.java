package A2Z_Sheet.Step3.Lec1;

// “What if N is very large?”
//        “Sum method may cause overflow, so XOR method is safer.”

public class MissingNumber {
    static int missingNumber(int[] arr, int N){

        //Brute force approach
//        for (int i = 1; i <= N; i++) {
//            boolean found = false;
//            for (int j = 0; j < N - 1; j++) {
//                if (a[j] == i) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) return i;
//        }
//        return -1;

        //optimal solution for small N
//        int sum = (N+(N+1))/2;
//        int actualSum = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            actualSum+=arr[i];
//        }
//        return sum - actualSum;

        //optimal solution for large N
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < N-1; i++) {
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1^=N;
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingNumber(arr,5));
    }
}
