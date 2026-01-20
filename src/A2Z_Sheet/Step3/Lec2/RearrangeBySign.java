package A2Z_Sheet.Step3.Lec2;
//Ps:2149
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeBySign {
    static int[] rearrange(int[] nums){
        //Brute force
//        List<Integer> pos = new ArrayList<Integer>();
//        List<Integer> neg = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>=0){
//                pos.add(nums[i]);
//            }else neg.add(nums[i]);
//        }
//        for (int i = 0; i < nums.length/2; i++) {
//            nums[2*i] = pos.get(i);
//            nums[2*i+1] = neg.get(i);
//        }
//        return nums;


        //Optimal Approach
        int[] newArr = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0){
                newArr[pos] = nums[i];
                pos = pos+2;
            }else {
                newArr[neg] = nums[i];
                neg = neg+2;
            }
        }
        return newArr;
        
        
        //Follow up if pos!=neg
//        List<Integer> pos = new ArrayList<Integer>();
//        List<Integer> neg = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>=0){
//                pos.add(nums[i]);
//            }else neg.add(nums[i]);
//        }
//
//        if (pos.size() > neg.size()){
//            for (int i = 0; i < neg.size(); i++) {
//                  nums[2*i] = pos.get(i);
//                  nums[2*i+1] = neg.get(i);
//            }
//            int index = neg.size()*2;
//            for (int i = neg.size(); i < pos.size(); i++) {
//                nums[index] = pos.get(i);
//                index++;
//            }
//        }else {
//            for (int i = 0; i < pos.size(); i++) {
//                nums[2*i] = pos.get(i);
//                nums[2*i+1] = neg.get(i);
//            }
//            int index = pos.size()*2;
//            for (int i = pos.size(); i < neg.size(); i++) {
//                nums[index] = neg.get(i);
//                index++;
//            }
//        }
//        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,-3,-1,-2,-3};

        System.out.println(Arrays.toString(rearrange(nums)));
    }
}
