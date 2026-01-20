package A2Z_Sheet.Step1.Lec4;

import java.util.ArrayList;

public class AllDivisors {
    static void allDivisor(int n){
        ArrayList<Integer> div = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                div.add(i);
            }
        }
        System.out.println(div);
    }

    public static void main(String[] args) {
        int n = 36;
        allDivisor(n);
    }
}
