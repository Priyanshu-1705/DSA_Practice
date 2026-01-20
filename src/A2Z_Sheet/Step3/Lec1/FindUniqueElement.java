package A2Z_Sheet.Step3.Lec1;
//Ps:136
public class FindUniqueElement {
    static int unique(int[] nums){
        //brute force
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            int num = nums[i];
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (nums[j] == num)
//                    count++;
//            }
//            if (count == 1) return num;
//        }
//        return -1;

        //Better approach
//        int n = nums.length;
//        int maxi = nums[0];
//        for (int i = 0; i < n; i++) {
//            maxi = Math.max(maxi, nums[i]);
//        }
//        int[] hash = new int[maxi + 1];
//        for (int i = 0; i < n; i++) {
//            hash[nums[i]]++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (hash[nums[i]] == 1)
//                return nums[i];
//        }
//        return -1;



        //optimal approach by me
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(unique(arr));
    }
}
