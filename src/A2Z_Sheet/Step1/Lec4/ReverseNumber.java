package A2Z_Sheet.Step1.Lec4;

public class ReverseNumber {
    static int reverse(int x){
        if(x ==0) return 0;
        int rev = 0;
        while (x !=0){
            int digit = x %10;
            x /=10;

        //For checking rev digits exceeding 32bits
//            if (rev > 214748364 || (rev == 214748364 && digit > 7)) return 0;
//            if (rev < -214748364 || (rev == -214748364 && digit < -8)) return 0;
            //optimal
//            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE / 10) return 0;

            rev = rev*10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println("Original: "+n);
        System.out.println("Reverse: "+reverse(n));
    }
}
