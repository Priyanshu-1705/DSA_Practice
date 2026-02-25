package A2Z_Sheet.Step5.Lec2;
//Ps:451
import java.util.*;

public class SortCharactersByFrequency {
    static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //Frequency count
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //list for sorting
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        //Custom Sorting
        Collections.sort(list,(a,b) -> {
            int freq = map.get(b) - map.get(a);  //b-a for descending order
            if (freq == 0){
                return b-a;
            }
            return freq;
        });

        //String Building
        StringBuilder res = new StringBuilder();
        for (char key: list){
            int freq = map.get(key);
            for (int i = 0; i < freq; i++) {
                res.append(key);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }

}
