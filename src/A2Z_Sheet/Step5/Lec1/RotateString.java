package A2Z_Sheet.Step5.Lec1;
//Ps:796
public class RotateString {
    static boolean rotateString(String s, String goal) {
        //Brute force
//        if (s.length() != goal.length()) return false;
//        for (int i = 0; i < s.length(); i++) {
//            String rotated = s.substring(i)+s.substring(0,i);
//            if (rotated.equals(goal)) return true;
//        }
//        return false;

        //Optimal approach
//        Agar hum dono string ko add krdenge toh humara goal uss new string me present hoga
        if (s.length() != goal.length()) return false;
        String doublestring = s+s;
        return doublestring.contains(goal);
    }


    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";
        System.out.println(rotateString(s,goal));
    }
}
