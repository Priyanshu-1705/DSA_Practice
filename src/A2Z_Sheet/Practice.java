package A2Z_Sheet;

import java.util.Arrays;

public class Practice {
     static public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].toLowerCase().equals("++x")){
                ++x;
            }else if(operations[i].toLowerCase().equals("x++")){
                x++;
            }else if(operations[i].toLowerCase().equals("--x")){
                --x;
            }else if(operations[i].toLowerCase().equals("x--")){
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] arr = {"++X","++X","X++"};
        System.out.println(arr[0]);
        System.out.println(finalValueAfterOperations(arr));
    }
}
