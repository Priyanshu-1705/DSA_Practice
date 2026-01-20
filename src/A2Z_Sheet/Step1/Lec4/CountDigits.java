package A2Z_Sheet.Step1.Lec4;

public class CountDigits {
    static int count(int n){
        if (n==0){
            return 1;
        }
        //Brute force
//        int c = 0;
//        while (n!=0){
//            n = n /10;
//            c++;
//        }
//        return c;
        //Optimal soln
        int digits = (int)(Math.log10(n)+1);
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(count(0));
    }
}
