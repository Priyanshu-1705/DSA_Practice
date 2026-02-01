package A2Z_Sheet.Step4.Lec1;

public class FloorAndCeil {
    static int findFloor(int[] nums, int x){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid]<=x){
                ans = nums[mid];
                low = mid + 1;
            }else high = mid - 1;
        }
        return ans;
    }
    static int findCeil(int[] nums, int x){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (nums[mid]>=x){
                ans = nums[mid];
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={3, 4, 4, 7, 8, 10};
        int x = 8;
        System.out.println("Ceil: "+ findCeil(arr,x));
        System.out.println("floor: "+ findFloor(arr,x));

    }
}
