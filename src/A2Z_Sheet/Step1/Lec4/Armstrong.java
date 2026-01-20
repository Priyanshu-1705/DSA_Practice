package A2Z_Sheet.Step1.Lec4;


public class Armstrong {
    static boolean isArmstrong(int n){
        int pow = CountDigits.count(n);
        int temp = n;
        int sum = 0;
        while (temp>0){
           int a = temp%10;
           temp/=10;
           sum = (int) (sum + Math.pow(a,pow));
        }
        return (sum==n)?true:false;
    }

    public static void main(String[] args) {
        int n = 37;
        if (isArmstrong(n)) System.out.println(n+" is a Armstrong");
        else System.out.println(n+" is not a Armstrong");
    }
}
