package A2Z_Sheet.Step5.Lec2;
//Ps:8
public class StringToInteger {
        static final int INT_MIN_VAL = -2147483648;
        static final int INT_MAX_VAL = 2147483647;

        static int myAtoi(String s) {
            int i = 0;

            // 1. Remove leading spaces
            while (i < s.length() && s.charAt(i) == ' ') i++;

            // 2. Check sign
            int sign = 1;
            if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                sign = (s.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            // 3. Parse digits using recursion
            return helper(s, i, 0, sign);


            //Iterative optimized Approach
//            int i = 0, n = s.length();
//            int sign = 1;
//            int result = 0;
//            // 1. Skip leading spaces
//            while (i < n && s.charAt(i) == ' ') {
//                i++;
//            }
//            // 2. Check sign
//            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//                sign = (s.charAt(i) == '-') ? -1 : 1;
//                i++;
//            }
//            // 3. Convert digits
//            while (i < n && Character.isDigit(s.charAt(i))) {
//                int digit = s.charAt(i) - '0';
//                // 4. Overflow check
//                if (result > (Integer.MAX_VALUE - digit) / 10) {
//                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//                }
//                result = result * 10 + digit;
//                i++;
//            }
//            return result * sign;
        }

        private static int helper(String s, int ind, long num, int sign) {
            // Base case
            if (ind >= s.length() || !Character.isDigit(s.charAt(ind))) {
                return (int) (num * sign);
            }

            num = num * 10 + (s.charAt(ind) - '0');

            // Overflow check
            if (sign == 1 && num > INT_MAX_VAL) return INT_MAX_VAL;
            if (sign == -1 && -num < INT_MIN_VAL) return INT_MIN_VAL;

            return helper(s, ind + 1, num, sign);
        }



    public static void main(String[] args) {
        String s = "   -123";
        System.out.println(myAtoi(s));
    }
}
