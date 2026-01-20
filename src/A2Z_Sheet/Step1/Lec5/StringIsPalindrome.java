package A2Z_Sheet.Step1.Lec5;

public class StringIsPalindrome {
    static boolean isPalindrome(int i, String s){
        String str = s.toLowerCase().replaceAll(" ","");
        if (i>=str.length()) return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return isPalindrome(i+1,str);
    }

    public static void main(String[] args){
        String a ="aa";
        System.out.println(isPalindrome(0,a));
    }
}


