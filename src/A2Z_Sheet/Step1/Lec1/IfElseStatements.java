package A2Z_Sheet.Step1.Lec1;

import java.util.Scanner;

public class IfElseStatements {
    static void grade(int n){
        if (n>=90) System.out.println("Grade A");
        else if (n>=70) {
            System.out.println("Grade B");
        } else if (n>=50) {
            System.out.println("Grade C");
        } else if (n>=35) {
            System.out.println("Grade D");
        }else System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        grade(num);
    }
}
