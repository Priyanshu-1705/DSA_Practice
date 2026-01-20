package A2Z_Sheet.Step1.Lec1;

import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(n);

    }
}
public class UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.printNumber(sc);
    }
}
