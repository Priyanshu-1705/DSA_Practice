package A2Z_Sheet.Step1.Lec5;

public class FibonacciSeries {
    static void printFib(int n){
        for (int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    static int fib(int n){
        if (n<=1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        printFib(n);
    }
}
