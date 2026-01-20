package A2Z_Sheet.Step1.Lec4;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n==2) return true;
        for (int i = 2; i <=(int)Math.sqrt(n) ; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPrime(n));
    }
}
