package A2Z_Sheet.Step1.Lec2;

public class Patterns {
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6 (int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern7 (int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                    System.out.print(" ");
            }
            for (int j = 0; j <2*i+1; j++) {
                    System.out.print("*");
            }
            for (int j = 0; j <n-i-1; j++) {
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8 (int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9 (int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n-1; i++) {
//            for (int j = i; j <=n-1; j++) {
//                System.out.print("*");
//            }
//        System.out.println();
//        }

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if(i>n) stars=2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern11(int n){
        int start = 1;
        for (int i = 0; i <n; i++) {
            if(i%2==0) start = 1;
            else start = 0;
            for (int j = 0; j <=i; j++) {
                System.out.print(start);
                start= 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int i = 1; i <=n ; i++) {
            //numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            //spaces
            for (int j = 1;j<=2*(n-i) ;j++){
                System.out.print(" ");
            }
            //numbers
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern13(int n ){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n ){
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <65+i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern15(int n ){
        for (int i = n; i >0 ; i--) {
            for (char j = 'A'; j <65+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern16(int n ){
        char c ='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
    static void pattern17 (int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <=2*i+1; j++) {
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n ){
        char c = (char)(65+n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print((char)(c+j) + " ");
            }
            System.out.println();
            c--;
        }
    }
    static void pattern19(int n){
        //first half
        for (int i = 0; i < n; i++) {
            //star
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0;j<2*i;j++){
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern20(int n){
        //first half
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 2*(n-i);j>0;j--){
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = 1; i < n; i++) {
            //star
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0;j<2*i;j++){
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        for (int i = 1; i <= n; i++) {
            if (i==1 || i==n){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < n; j++) {
                    if(j==0||j==n-1){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern22(int n){
        int size = 2 * n - 1;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
//        pattern15(1);
//        pattern16(5);
//        pattern17(4);
//        pattern18(5);
//        pattern19(5);
//        pattern20(5);
//        pattern21(4);
        pattern22(4);


    }



}
