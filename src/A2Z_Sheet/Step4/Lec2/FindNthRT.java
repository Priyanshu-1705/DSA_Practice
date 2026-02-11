package A2Z_Sheet.Step4.Lec2;

public class FindNthRT {
    static int nthRt(int n, int m){
        // Set low and high for binary search
        int low = 1, high = m;
        // Start binary search
        while (low <= high) {
            // Calculate mid
            int mid = (low + high) / 2;
            // Store result of mid^n
            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= mid;
                if (ans > m) break;
            }
            // If mid^n equals m
            if (ans == m) return mid;
            // If mid^n is less than m
            if (ans < m) low = mid + 1;
                // If mid^n is more than m
            else high = mid - 1;
        }
        // Return -1 if not found
        return -1;
    }
    private static int isRoot(int num, int pow){
        for (int i = 1; i <= pow; i++) {
            num*=num;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(nthRt(n,m));
    }
}
