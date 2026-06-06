package A2Z_Sheet.Step9.Lec3;
//Ps:42
public class TrappingRainWater {
    static int trap(int[] height) {
        //Brute Force
//        int n = height.length;
//        int[] prefixMax = new int[n];
//        int[] suffixMax = new int[n];
//        prefixMax[0] = height[0];
//        for (int i = 1; i < n; i++) {
//            prefixMax[i] = Math.max(height[i], prefixMax[i - 1]);
//        }
//        suffixMax[n - 1] = height[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            suffixMax[i] = Math.max(height[i], suffixMax[i + 1]);
//        }
//        int total = 0;
//        for (int i = 0; i < height.length; i++) {
//            int leftMax = prefixMax[i];
//            int rightMax = suffixMax[i];
//            if (height[i]<leftMax && height[i] < rightMax){
//                total+=Math.min(leftMax,rightMax)-height[i];
//            }
//        }
//        return total;

        //Optimal
        int left = 0;
        int right = height.length-1;
        int leftMax = 0, rightMax = 0, total = 0;
        while (left<right){
            if (height[left] <= height[right]){
                if (leftMax > height[left]){
                    total+=leftMax-height[left];
                }else leftMax = height[left];
                left++;
            }else {
                if (rightMax > height[right]){
                    total+= rightMax - height[right];
                }else rightMax = height[right];
                right--;
            }
        }
        return total;
    }
}
