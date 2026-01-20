package A2Z_Sheet.Step1.Lec6;

import java.util.HashMap;
import java.util.Map;

public class Highest_Lowest_Frequency {
    static void countfreq(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else map.put(arr[i], 1);
        }
      int minfreq = arr.length; int minele = 0;
      int maxfreq = 0; int maxele = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > maxfreq){
                maxfreq = count;
                maxele = element;
            }
            if (count < minfreq){
                minfreq = count;
                minele = element;
            }
        }
        System.out.println("The highest frequency element is: " + maxele);
        System.out.println("The lowest frequency element is: " + minele);
    }

    public static void main(String[] args) {
        int[] array = {2,2,3,4,4,2};
        countfreq(array);
    }
}
