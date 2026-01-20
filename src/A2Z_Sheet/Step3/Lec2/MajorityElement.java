package A2Z_Sheet.Step3.Lec2;
//Ps:169
public class MajorityElement {
    static int getMajorityElement(int[] nums){
        int n = nums.length;
        //Brute force
//        for (int i = 0; i < n; i++) {
//            int count=0;
//            for (int j = 1; j < n; j++) {
//                if (nums[j] == nums[i]){
//                    count++;
//                }
//            }
//            if (count>=n/2){
//                return nums[i];
//            }
//        }
        //Optimal Approach - Boyer–Moore Majority Vote Algo
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count==0){
                count++;
                element = nums[i];
            } else if (nums[i] == element ) {
                count++;
            }else count--;
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count++;
            }
        }
        if (count>n/2) return element;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(getMajorityElement(nums));
    }
}
