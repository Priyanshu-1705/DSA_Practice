package A2Z_Sheet.Step8.Lec1;

public class CheckIthBit {
    static boolean isIthBitSet(int n, int i){
        //Brute Force
//        StringBuilder sb = new StringBuilder();
//        while (n>0){
//            sb.append((n%2==0?0:1));
//            n/=2;
//        }
//        sb.reverse();
//        return sb.charAt(i) == '1';

        //Optimal aproach
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        System.out.println(isIthBitSet(n,i));
    }
}
