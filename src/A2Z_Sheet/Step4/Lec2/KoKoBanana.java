package A2Z_Sheet.Step4.Lec2;
//Ps:875
public class KoKoBanana {
    static int findSpeed(int[] pile, int h){
        if (pile.length == 1) return pile[0];
        int low = 1;
        int high = 0;
        for (int p: pile){
            high = Math.max(high,p);
        }
        int ans = high;

        while (low<=high){
            int mid = low + (high-low)/2;
            if (isPossible(pile, mid, h)){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
    private static boolean isPossible(int[] pile, int speed, int hours){
        int hrs = 0;
        for (int p: pile){
            hrs+=(p+speed-1)/speed;    //Ceil (a/b) = (a+b-1)/b
        }
        return hrs<=hours;
    }

    public static void main(String[] args) {
        int a[] = {7, 15, 6, 3};
        int h = 8;
        System.out.println(findSpeed(a,h)+"bananas/hr");
    }
}
