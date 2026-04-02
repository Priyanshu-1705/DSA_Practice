package A2Z_Sheet.Step8.Lec1;

public class OddEven {
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isOdd(n));
    }
}
