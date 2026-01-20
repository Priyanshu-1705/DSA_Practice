package A2Z_Sheet.Step1.Lec4;

public class Palindrome {
    static boolean isPalindrome(int x){
        int original = x;
        int rev = 0;
        while (x >0){
            int digit = x %10;
            x /=10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE / 10) return false;
            rev = rev*10 + digit;
        }
        if(rev==original) return true;
        else return false;
    }

    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) System.out.println(n+" is a palindrome");
        else System.out.println(n+" is not a palindrome");
    }
}
