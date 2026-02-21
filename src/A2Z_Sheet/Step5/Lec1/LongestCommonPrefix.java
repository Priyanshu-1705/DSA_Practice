package A2Z_Sheet.Step5.Lec1;
import java.util.Arrays;
//Ps:14
public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int ind = 0;
        while (ind<first.length()){
            if (first.charAt(ind) == last.charAt(ind)) ind++;
            else break;
        }
        return first.substring(0,ind);
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
