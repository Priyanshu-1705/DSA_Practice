package A2Z_Sheet.Step1.Lec4;

public class GCD {
    static int gcd(int a , int b){
        int ans = 1;
        int div = 1;
        while (div!=a && div!=b){
            if(a % div == 0 && b % div == 0){
                ans = div;
            }
            div++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 15;
        System.out.println("GCD of "+x+" and "+y+" is "+ gcd(x,y));
    }
}
