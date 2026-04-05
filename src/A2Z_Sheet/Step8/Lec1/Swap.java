package A2Z_Sheet.Step8.Lec1;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Before Swapping -> " + "a: " + a + ", b: " + b);
        //Swap without extra variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping -> " + "a: " + a + ", b: " + b);
    }
}
