package A2Z_Sheet.Step5.Lec1;
//Ps:242
import java.util.Arrays;
public class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        //Brute force
//        if (s.length() != t.length()) return false;
//        char[] arr1 = s.toCharArray();
//        char[] arr2 = t.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) return false;
//        }
//        return true;
        if (s.length() != t.length()) return false;
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (arr[s.charAt(i)] != 0){
                arr[s.charAt(i)]--;
            }else {
                arr[s.charAt(i)]++;
            }
        }
        for (int i: arr){
            if (i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagrama";
        System.out.println(isAnagram(s,t));
    }
}
