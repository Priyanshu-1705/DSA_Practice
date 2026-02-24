package A2Z_Sheet.Step5.Lec2;

public class LongestPalindromicString {
     static String longestPalindrome(String s) {
         //Brute force
//         String ans = "";
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j < s.length(); j++) {
//                 String temp = s.substring(i,j+1);
//                 if (isPalindrome(temp) && temp.length()>ans.length()){
//                     ans = temp;
//                 }
//             }
//         }
//         return ans;
return "";
    }
    private static boolean isPalindrome(String s){
         int left = 0;
         int right = s.length() -1;
         while (left<right){
             if (s.charAt(left) != s.charAt(right)) return false;
             else{
                 left++;
                 right--;
             }
         }
         return true;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
