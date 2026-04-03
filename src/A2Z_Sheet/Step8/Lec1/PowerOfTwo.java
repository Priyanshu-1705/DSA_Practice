package A2Z_Sheet.Step8.Lec1;
//Ps:231
public class PowerOfTwo {
    static boolean isPowerOfTwo(int n){
        return n > 0 && (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPowerOfTwo(n));
    }
}
