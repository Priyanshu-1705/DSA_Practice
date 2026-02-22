package A2Z_Sheet.Step5.Lec1;
//Ps:1903
public class LargestOddNumber {
    static String largestOddNumber(String num) {
        int s = 0;
        int e = num.length()-1;
        while (e>=0){
            if ((num.charAt(e) - '0') % 2 == 0) e--;
            else break;
        }
        while (s<=e){
            if ((num.charAt(s) - '0') == 0) s++;
            else break;
        }
       return num.substring(s,e+1);
    }

    public static void main(String[] args) {
        String s = "0214638";
        System.out.println(largestOddNumber(s));
    }
}
