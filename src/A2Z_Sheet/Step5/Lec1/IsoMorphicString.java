package A2Z_Sheet.Step5.Lec1;
import java.util.HashMap;
//Ps:205
public class IsoMorphicString {
    static boolean isIsomorphic(String s, String t) {
        //Using Hashmap
//        if (s.length() != t.length()) return false;
//        HashMap<Character, Character> mapST = new HashMap<>();
//        HashMap<Character, Character> mapTS = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//            // s -> t check
//            if (mapST.containsKey(c1)) {
//                if (mapST.get(c1) != c2) {
//                    return false;
//                }
//            } else {
//                mapST.put(c1, c2);
//            }
//            // t -> s check (reverse)
//            if (mapTS.containsKey(c2)) {
//                if (mapTS.get(c2) != c1) {
//                    return false;
//                }
//            } else {
//                mapTS.put(c2, c1);
//            }
//        }
//        return true;

        //Using array
            if (s.length() != t.length()) return false;
            int[] map1 = new int[256];
            int[] map2 = new int[256];
            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if (map1[c1] != map2[c2]) {
                    return false;
                }
                map1[c1] = i + 1;
                map2[c2] = i + 1;
            }
            return true;
        }


    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }
}
