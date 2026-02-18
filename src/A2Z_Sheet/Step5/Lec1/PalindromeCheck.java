package A2Z_Sheet.Step5.Lec1;

import java.util.ArrayList;
import java.util.Collections;


public class PalindromeCheck {
    static String reverseWords(String s) {

        //Brute force
        // List to store words
//        ArrayList<String> words = new ArrayList<>();
//        // Use StringBuilder instead of String
//        StringBuilder word = new StringBuilder();
//        // Traverse string
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            // If not space → build word
//            if (ch != ' ') {
//                word.append(ch);
//            }
//            // If space and word is ready
//            else if (word.length() > 0) {
//                words.add(word.toString());
//                word.setLength(0); // reset
//            }
//        }
//        // Add last word if exists
//        if (word.length() > 0) {
//            words.add(word.toString());
//        }
//        // Build final result in reverse order
//        StringBuilder result = new StringBuilder();
//        for (int i = words.size() - 1; i >= 0; i--) {
//            result.append(words.get(i));
//            if (i != 0) {
//                result.append(" ");
//            }
//        }
//        return result.toString();


        //Optimal Approach
        StringBuilder result = new StringBuilder();
        // Pointer starting from the end int i = s.length() - 1;
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(s, i + 1, j + 1);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String  s = "welcome to the jungle";
        System.out.println(reverseWords(s));
    }
}
