package A2Z_Sheet.Step3.Lec2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    static List getLeader(int[] nums){
        ArrayList<Integer> leader = new ArrayList<>();
        if(nums.length == 0) return leader;

        //Brute force
//        for (int i = 0; i < nums.length; i++) {
//            boolean isHigher = true;
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]<nums[j]) {
//                    isHigher = false;
//                    break;
//                }
//            }
//            if (isHigher){
//                if(!leader.contains(nums[i])){
//                    leader.add(nums[i]);
//                }
//            }
//        }

        //Optimal approach
        int max = nums[nums.length-1];
        leader.add(max);
        for (int i = nums.length-2; i >0 ; i--) {
            if (nums[i]>max){
                leader.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(leader);
        return leader;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(getLeader(arr));
    }
}
