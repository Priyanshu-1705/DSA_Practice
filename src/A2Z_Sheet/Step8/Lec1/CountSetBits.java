package A2Z_Sheet.Step8.Lec1;
//Ps:191
public class CountSetBits {
    static int countSetBits(int n){
       //Brute force
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        while (n>0){
//            if (n%2==1){
//                count++;
//            }
//            n/=2;
//        }
//        return count;

        //Optimal approach
        int count = 0;
        while (n!=0){
            if ((n&1) == 1) count++;
            n = n >> 1;
        }
        return count;

        //Direct answer
//        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(countSetBits(n));
    }
}
