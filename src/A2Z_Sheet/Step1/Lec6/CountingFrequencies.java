package A2Z_Sheet.Step1.Lec6;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequencies {
    static void frequency(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }
            else map.put(array[i], 1);
        }
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
    }

    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        frequency(arr);
    }
}
