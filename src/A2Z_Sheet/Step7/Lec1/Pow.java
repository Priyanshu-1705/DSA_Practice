package A2Z_Sheet.Step7.Lec1;
//Ps:50
public class Pow {
    public double myPow(double x, int n) {
        if(x < 0){
            return 1.0 / power(x, -n);
        }
        return power(x, n);
    }
    private double power(double x, int n){
        if(n == 0) return 1.0;
        if(n == 1) return x;

        if (x % 2 == 0) return power(x*x, n/2);
        return x * power(x, n - 1);
    }
}
