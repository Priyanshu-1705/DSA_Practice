package A2Z_Sheet.Step4.Lec2;

public class FindSQRT {
    static int sqrt(int N){
        int low = 1;
        int high = N;
        while (low<=high){
            int mid = low + (high-low)/2;
            int sqr = mid * mid;
            if (sqr == N) return mid;
             else if (sqr < N) low = mid + 1;
             else high = mid - 1;
        }
        return low-1;
    }

    public static void main(String[] args) {
        int N = 56;
        System.out.println(sqrt(N));
    }
}
