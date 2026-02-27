package A2Z_Sheet.Step5.Lec2;

import java.util.HashMap;

public class CountSubStrings {
    static int countSubstring(String s, int k){
        return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
    }
    private static int atMostKDistinct(String s, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while (right<s.length()){
            // Add current character
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0) + 1);

            // Shrink window if distinct characters exceed k
            while (map.size()>k){
                char ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0){
                    map.remove(ch);
                }
                left++;
            }

            // Count substrings in current window
            res+=(right - left + 1);
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(countSubstring(s,k));
    }
}
